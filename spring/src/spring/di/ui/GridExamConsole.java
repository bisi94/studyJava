package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("天天天天天天天天天天天天天天");
		System.out.println("太 total 太  avg  太");
		System.out.println("天天天天天天天天天天天天天天");
		System.out.printf("太 %3d  太 %3.2f  太\n", exam.total(), exam.avg());
		System.out.println("天天天天天天天天天天天天天天");
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
