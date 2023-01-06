package Homework.core;



public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println( data + " Dosya tarafından Loglandı " );
		
	}

}
