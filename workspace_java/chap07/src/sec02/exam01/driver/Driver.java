package sec02.exam01.driver;

public class Driver {

	void driveTico(Tico tico) {
		System.out.println(" 오직 티코! ");
		tico.run();
		tico.autoRun();
	}
		void drive(Car car) {
			System.out.println("run 박아");
			car.start();
			car.run();
			////////////////////////////////////
			if( car instanceof Tico ) {
			   Tico tico = (Tico) car;
			   tico.autoRun();
			   
			   ((Tico)car).autoRun(); // 위에랑 똑같다
			}
			////////////////////
			car.stop();
			
//			car.autoRun(); 카에는 오토런이 없다
		}
}
