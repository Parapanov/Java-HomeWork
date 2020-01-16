import com.kasparov.config.PieacesColor;
import com.kasparovtron.pieaces.Bishop;
import com.kasparovtron.pieaces.Pawn;
import com.kasparovtron.pieaces.Rook;
import com.kasparovtron.pieaces.Knight;
import com.kasparovtron.test.BishopTest;
import com.kasparovtron.test.KingTest;
import com.kasparovtron.test.KnightTest;
import com.kasparovtron.test.PawnTest;
import com.kasparovtron.test.QueenTest;
import com.kasparovtron.test.RookTest;

public class Application {

	public static void main(String[]	args){
		
		//how to restrict the input  parameter
		//i need only two specific color strings
		//Pawn p1 = new Pawn(PieacesColor.BLACK, 1, 0);
		//Rook r1 =	new Rook(PieacesColor.Black, 0, 0);
		
		PawnTest.run();
		RookTest.run();
		BishopTest.run();
		KnightTest.run();
		QueenTest.run();
		KingTest.run();
		
	}
}
