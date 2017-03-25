package test01;

import java.util.Random;

public class LottoGame {
	//Fields
	private int[] _elementArray;
	private static int _elementNum = 6;
	private int[] _numberArray;//maximum size 50
	private Random _rnd = new Random();
	private static int _setSize = 50;
	
	//Methods
	public LottoGame(int elementNum, int setSize){
		_elementArray = new int[elementNum];
        _numberArray = new int[setSize];
        for(int i=1 ; i <= 50 ; i++){
            _numberArray[i-1] = i;
        }
        pickElements();
	}
	public void pickElements(){
		int index;
        for(int i=0 ; i < _elementNum ; i++){
            //pick random index
            index = _rnd.nextInt(_setSize);
            _elementArray[i] = _numberArray[index];
            _numberArray[index] = _numberArray[_setSize-1];
            System.out.print(_elementArray[i] + " ");
        }
	}
	
	public static void main(String[] args){
		new LottoGame(_elementNum,_setSize);
	}//End Main
}//End class
