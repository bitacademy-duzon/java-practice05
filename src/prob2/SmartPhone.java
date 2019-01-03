package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if ("음악".equals(function)) {
			playMusic();
			return;
		}
		
		if ("앱".equals(function)) {
			playApp();
			return;
		}
		
		super.execute(function);
	}
	
	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	public void playApp() {
		System.out.println("앱실행");
	}
	
}
