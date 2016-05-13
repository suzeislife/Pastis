package application;

public class PastisModel implements IPastisModel {

	private static final int LENGTH_PASSWORD = 12;
	
	private String password;
	private int lengthPass;
	private boolean ucLetter;
	private boolean lcLetter;
	private boolean digits;
	private boolean symbole;
	private boolean pronounceable;
	private boolean ambigus;

	public PastisModel(){
		this.password = null;
		this.lengthPass = LENGTH_PASSWORD;
		this.ucLetter = false;
		this.lcLetter = false;
		this.digits = false;
		this.symbole = false;
		this.pronounceable = false;
		this.ambigus = false;
	}
	
	@Override
	public int getLength() {
		return lengthPass;
	}

	@Override
	public void setLength(int length) {
		lengthPass = length;
	}

	@Override
	public boolean hasUcLetters() {
		return ucLetter;
	}

	@Override
	public void setUcLetters(boolean ucLetters) {
		ucLetter = ucLetters;
	}

	@Override
	public boolean hasLcLetters() {
		return lcLetter;
	}

	@Override
	public void setLcLetters(boolean lcLetters) {
		lcLetter = lcLetters;
	}

	@Override
	public boolean hasDigits() {
		return digits;
	}

	@Override
	public void setDigits(boolean digits) {
		this.digits = digits;
	}

	@Override
	public boolean hasSymbols() {
		return symbole;
	}

	@Override
	public void setSymbols(boolean symbols) {
		symbole = symbols;
	}

	@Override
	public boolean isPronounceable() {
		return pronounceable;
	}

	@Override
	public void setPronounceable(boolean pronounceable) {
		this.pronounceable = pronounceable;
	}

	@Override
	public boolean isUnambiguous() {
		return ambigus;
	}

	@Override
	public void setUnambiguous(boolean unambiguous) {
		ambigus = unambiguous;
	}

	@Override
	public String generateNewPassword() {
		
		
		return password;
	}

}
