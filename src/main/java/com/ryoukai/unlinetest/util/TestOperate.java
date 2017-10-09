package com.ryoukai.unlinetest.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.ryoukai.unlinetest.dto.QuestionInfo;
import com.ryoukai.unlinetest.dto.TestPaperInfo;


/**
 * 对试题文件、答案文件的校验、读取
 * @author Ryoukai
 *
 */
public class TestOperate implements Comparator<QuestionInfo>{
	
	private static SAXReader reader = null;
	
	private static TestOperate testOperate = null;
	
	public static SAXReader getReader() {
		if(reader == null) {
			reader = new SAXReader();
		}
		return reader;
	}
	
	public static TestOperate getTestOperate() {
		if(testOperate == null) {
			testOperate = new TestOperate();
		}
		return testOperate;
	}
	
	/**
	 * 校验试卷
	 * @param filePath 试卷文件路径
	 */
	public static void checkTest(String filePath) {
		
	}
	
	/**
	 * 读取试卷文件
	 * @param filePath 试卷文件路径
	 * @param testPaper TestPaper实体类
	 */
	public static void readTest(String filePath, TestPaperInfo testPaper) {
		SAXReader reader = TestOperate.getReader();
		try {
			File f = new File(filePath);
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			Element testType = root.element("testType");
			testPaper.setTestType(testType.getTextTrim().trim());
			Element testDesc = root.element("testDesc");
			testPaper.setTestDesc(testDesc.getTextTrim().trim());
			@SuppressWarnings("unchecked")
			List<Element> questions = root.elements("question");
			ArrayList<QuestionInfo> questionsList = new ArrayList<QuestionInfo>();
			Iterator<Element> iterator = questions.iterator();
			while(iterator.hasNext()) {
				Element question = iterator.next();
				QuestionInfo q = new QuestionInfo();
				q.setQuestionId(Integer.parseInt(question.elementTextTrim("no")));
				q.setQuestionType(question.elementText("questionType").trim());
				q.setQuestionContent(question.elementText("questionContent").trim());
				//若试题类型为MC或SC时有选项
				if(q.getQuestionType().equals("SC") || q.getQuestionType().equals("MC")) {
					HashMap<String, String> optionMap = new HashMap<String, String>();
					@SuppressWarnings("unchecked")
					Iterator<Element> i = question.element("options").elementIterator();
					while(i.hasNext()) {
						Element option = i.next();
						String no = option.elementTextTrim("no").trim();
						String content = option.elementTextTrim("content").trim();
						optionMap.put(no, content);
					}
					q.setOptions(optionMap);
				}
				questionsList.add(q);
			}
			
			//先按questionId从小到大排序
			questionsList.sort(TestOperate.getTestOperate());
			
			testPaper.setQuestions(questionsList);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 读取答案文件
	 * @param filePath 答案文件路径
	 * @param testPaper TestPaper实体类
	 */
	public static void readSolution(String filePath, TestPaperInfo testPaper) {
		SAXReader reader = TestOperate.getReader();
		File f = new File(filePath);
		try {
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			@SuppressWarnings("unchecked")
			Iterator<Element> questionIterator = root.elementIterator();
			while (questionIterator.hasNext()) {
				Element question = questionIterator.next();
				Element questionId = question.element("no");
				Element solution = question.element("solution");
				Element thinking = question.element("thinking");
				
				//二分法查找答案对应的试题
				int low = 0;
				int high = testPaper.getQuestions().size() - 1;
				int qId = Integer.parseInt(questionId.getTextTrim());
				while(low <= high) {
					int middle = (low + high) / 2;
					int tpQId = testPaper.getQuestions().get(middle).getQuestionId();
					if(qId == tpQId) {
						testPaper.getQuestions().get(middle).setSolution(solution.getTextTrim().trim());
						testPaper.getQuestions().get(middle).setThinking(thinking.getTextTrim().trim());
						break;
					} else if(qId < tpQId) {
						high = middle - 1;
					} else {
						low = middle + 1;
					}
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	/*public static void main(String[] args) {
		TestPaper testPaper = new TestPaper();
		TestOperate.readTest("src/main/resources/testlibrary/2016年腾讯校招笔试题(研发岗).xml", testPaper);
		TestOperate.readSolution("src/main/resources/solutionlibrary/2016年腾讯校招笔试题(研发岗)-答案.xml", testPaper);
		System.out.println(testPaper.getQuestions().get(0).getThinking());
	}*/

	/**
	 * 实现compare方法，对testPaper中的questions按questionId从小到大进行排序
	 */
	public int compare(QuestionInfo q1, QuestionInfo q2) {
		if(q1.getQuestionId() < q2.getQuestionId()) {
			return 1;
		} else {
			return 0;
		}
	}

}
