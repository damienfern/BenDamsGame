package model;

import java.util.List;

import tools.data.ActionType;
import tools.data.Coord;
import tools.data.Couleur;
import model.piece.Pieces;

public class AbstractPiece implements Pieces {

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Couleur getCouleur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActionType doMove(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean catchPiece() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAlgoMoveOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAlgoMoveOk(int xFinal, int yFinal, ActionType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Coord> getMoveItinerary(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean undoLastMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean undoLastCatch() {
		// TODO Auto-generated method stub
		return false;
	}

}
