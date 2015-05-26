
public class Experiments {
	static StopWatch SW = new StopWatch();
	
	public static void main(String[] args) {
		experimentA();
		experimentB();
		experimentC();
		experimentD();
		experimentE();
		experimentF();
		experimentH();
		experimentJ();
	}
	
	public static void experimentJ() {
		double avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				System.out.println("Hi");
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment J1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				System.out.println("Hi");
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment J2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				System.out.println("Hi");
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment J3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentI() {
		double avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				int x = 1 + 2;
				double y = 1.0 + 2.0;
				Math.sin(45);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment I1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				int x = 1 + 2;
				double y = 1.0 + 2.0;
				Math.sin(45);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment I2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				int x = 1 + 2;
				double y = 1.0 + 2.0;
				Math.sin(45);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment I3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentH() {
		double avgTimeA = 0.0;
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				str1.compareTo(str2);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment H1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				str1.compareTo(str2);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment H2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				str1.compareTo(str2);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment H3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentG() {
		double avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				//
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment G1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				System.out.println("Hi");
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment G2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				System.out.println("Hi");
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment G3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentF() {
		double avgTimeA = 0.0;
		String k = "abcdefghijklmnopqrstuvwxyz";
		char alphaChars[] = k.toCharArray();
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				String str = new String(alphaChars);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment F1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				String str = new String(alphaChars);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment F2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				String str = new String(alphaChars);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment F3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentE() {
		double avgTimeA = 0.0;
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				String k = "abcdefghijklmnopqrstuvwxyz";
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment E1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				String k = "abcdefghijklmnopqrstuvwxyz";
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment E2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				String k = "abcdefghijklmnopqrstuvwxyz";
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment E3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentD() {
		double avgTimeA = 0.0;
		double x = 1.0;
		double y = 2.0;
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				Math.max(x, y);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment D1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				Math.max(x, y);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment D2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				Math.max(x, y);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment D3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}

	public static void experimentC() {
		double avgTimeA = 0.0;
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				double k = 1.0;
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment C1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				double k = 1.0;
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment C2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				double k = 1.0;
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment C3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}
	
	public static void experimentB() {
		double avgTimeA = 0.0;
		int x = 1;
		int y = 2;
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				Math.max(x, y);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment B1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				Math.max(x, y);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment B2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				Math.max(x, y);
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment B3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}

	
	public static void experimentA() {
		double avgTimeA = 0.0;
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000; j++) {
				int k = 1;
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment A1 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 100000000; j++) {
				int k = 1;
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment A2 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
		for (int i = 0; i < 5; i++) {
			SW.start();
			for (int j = 0; j < 1000000000; j++) {
				int k = 1;
			}
			SW.stop();
			avgTimeA += (SW.getElapsedTime());
		}
		avgTimeA = avgTimeA/5;
		System.out.println("Experiment A3 was: " + avgTimeA + " milliseconds");

		avgTimeA = 0.0;
		
	}

}
