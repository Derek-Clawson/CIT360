import java.util.*;

public class collections {

	public static void main(String[] args){
		
		System.out.println(gameList());
		
	}
	public static List<String> gameList(){
		List <String> game = new ArrayList<String>();
		
		game.add("Halo");
		game.add("Halo 2");
		game.add("Halo 3");
		game.add("Halo 4");
		
		
		return game;
	}
	public static List<String> gameGenreList(){
		LinkedList <String> gameGenere = new LinkedList<String>();
		
		gameGenere.add("FPS");
		
		String fps=gameGenere.get(0)+ " = Halo";
		
		gameGenere.set(0, fps);
		
		
		return gameGenere;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
