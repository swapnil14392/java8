package java8.collectors;

class Student{
	private String name;
	private int id;
	private String subject;
	private double percent;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public double getPercent() {
		return percent;
	}
	public Student(String name, int id, String subject, double percent) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + subject + ", percent=" + percent + "]";
	}
			
}
