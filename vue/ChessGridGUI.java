package vue;

import java.util.List;

import tools.data.Coord;
import controler.ChessGameControlerModelVue;

public class ChessGridGUI extends ChessGUI implements ChessGameGUI{

	public ChessGridGUI()
	{
		super();
	}
	
	public ChessGridGUI(ChessGameControlerModelVue chessGameControler) {
		super(chessGameControler);
		// TODO Auto-generated constructor stub
	}

//	public ChessGridGUI() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void setPieceToMove(Coord coord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetLight(List<Coord> coords, boolean isLight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movePiece(Coord targetCoord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undoMovePiece(Coord pieceToMoveInitCoord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPromotionType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void promotePiece(Coord coord, String promotionType) {
		// TODO Auto-generated method stub
		
	}

}
