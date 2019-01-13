package aeroplane_problem;

import aeroplane_problem.AeroplaneProblem.Node;

public class Main {

	public static void main(String[] args) {
		AeroplaneProblem plane = new AeroplaneProblem();
		plane.printPriceMat();
		plane.printMatrixNode();
		System.out.println(plane.getOneBestTrack());
		plane.getAllBestPathsRec();
		
	}

}
