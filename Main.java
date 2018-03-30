public class Main {
	public static void main(String[] args) {
		Arena arena = new Arena(2);
		arena.addPlayer(Arena.Team.A, Player.PlayerType.Tank, Arena.Row.Front, 1);
		arena.addPlayer(Arena.Team.A, Player.PlayerType.Samurai, Arena.Row.Front, 2);
		arena.addPlayer(Arena.Team.A, Player.PlayerType.Healer, Arena.Row.Back, 1);
		arena.addPlayer(Arena.Team.A, Player.PlayerType.BlackMage, Arena.Row.Back, 2);
		arena.addPlayer(Arena.Team.B, Player.PlayerType.Tank, Arena.Row.Front, 1);
		arena.addPlayer(Arena.Team.B, Player.PlayerType.Cherry, Arena.Row.Front, 2);
		arena.addPlayer(Arena.Team.B, Player.PlayerType.Phoenix, Arena.Row.Back, 1);
		arena.addPlayer(Arena.Team.B, Player.PlayerType.Samurai, Arena.Row.Back, 2);
		if (arena.validatePlayers()) arena.startBattle();
		else System.out.println("Invalid team setup");
	}
}
