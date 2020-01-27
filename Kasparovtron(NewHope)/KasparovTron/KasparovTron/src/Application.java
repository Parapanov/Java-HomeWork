import com.kasparov.config.PieacesColor;
import com.kasparov.config.ScannerTurnMoveOrAttack;
import com.kasparovtron.pieaces.Bishop;
import com.kasparovtron.pieaces.Chudaka;
import com.kasparovtron.pieaces.Pawn;
import com.kasparovtron.pieaces.Peice;
import com.kasparovtron.pieaces.Rook;
import com.kasparovtron.pieaces.Knight;
import com.kasparovtron.test.BishopTest;
import com.kasparovtron.test.ChudakaTest;
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
		
		//PawnTest.run();
		//RookTest.run();
		//BishopTest.run();
		//KnightTest.run();
		//QueenTest.run();
		//KingTest.run();
		//ChudakaTest.run();
		ScannerTurnMoveOrAttack.run();
		
		/*Pawn p = new Pawn(PieacesColor.BLACK,1,0);
		Chudaka c = new Chudaka(PieacesColor.BLACK,1,0);
		if(p instanceof	Pawn) {
			System.out.print("yes");
		}
		//System.out.print(p.color);
		if(p instanceof	Peice) {
			System.out.print("yes");
		}
		if(p instanceof	Object) {
			System.out.print("yes");
		}
		if(p instanceof	Pawn) {
			System.out.print("yes");
		}
		if(c instanceof	Chudaka) {
			System.out.print("yes");
		}
	}*/
	}
}
