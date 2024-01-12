import java.util.Random;

class CricketWebsite {
	private String score;

	public CricketWebsite() {
		this.score = "No score available";
	}

	public synchronized String getScore() {
		return score;
	}

	public synchronized void updateScore(String newScore) {
		System.out.println("Updating score: " + newScore);
		score = newScore;
	}
}

class ServerThread extends Thread {
	private CricketWebsite website;

	public ServerThread(CricketWebsite website) {
		this.website = website;
	}

	public void run() {
		Random random = new Random();
		String[] scores = { "100/2", "150/3", "200/4", "250/5", "300/6" };
		int index = 0;
		while (true) {
			String newScore = scores[index];
			website.updateScore(newScore);
			index = (index + 1) % scores.length;
			try {
				int sleepTime = random.nextInt(5000) + 1000;
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ClientThread extends Thread {
	private CricketWebsite website;

	public ClientThread(CricketWebsite website) {
		this.website = website;
	}

	public void run() {
		while (true) {
			String score = website.getScore();
			System.out.println("Current score: " + score);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class lab_8 {
	public static void main(String[] args) {
		CricketWebsite website = new CricketWebsite();
		ServerThread serverThread = new ServerThread(website);
		serverThread.start();
		ClientThread clientThread1 = new ClientThread(website);
		ClientThread clientThread2 = new ClientThread(website);
		ClientThread clientThread3 = new ClientThread(website);
		clientThread1.start();
		clientThread2.start();
		clientThread3.start();
	}
}
