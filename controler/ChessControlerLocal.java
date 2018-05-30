package controler;

import java.util.List;

import javax.swing.JLayeredPane;

import model.business.ChessGameModel;
import tools.data.ActionType;
import tools.data.Coord;
import tools.data.Couleur;

public class ChessControlerLocal implements ChessGameControlerModelVue{

	public ChessControlerLocal(ChessGameModel chessGame) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionsWhenPieceIsSelectedOnGUI(Coord pieceToMoveCoord,
			Couleur pieceToMoveCouleur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionsWhenPieceIsMovedOnGUI(Coord pieceToMoveCoord,
			Coord targetCoord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGridPanel(JLayeredPane panel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayerOk(Couleur pieceToMoveCouleur) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Couleur getPieceColor(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coord> getPieceListMoveOK(int xInit, int yInit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActionType move(int xInit, int yInit, int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pawnPromotion(int x, int y, String promotionType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnd() {
		// TODO Auto-generated method stub
		return false;
	}

}
