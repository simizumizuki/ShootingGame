import java.util.Vector;

public class GameFrame extends MyFrame{
	public void run() {
GameWorld.player =new Player(100,300,0,0);
addKeyListener(GameWorld.player);
GameWorld.playerBullets=new Vector<PlayerBullet>();
GameWorld.enemies = new Vector<Enemy>();
GameWorld.enemies.add(new EnemyBase(100,50,1,0));
while(true) {
	clear();
	GameWorld.player.draw(this);
	GameWorld.player.move();
	movePlayerBullet();
	moveEnemies() ;
	for(int i = 0;i<GameWorld.enemies.size();i++) {
		Enemy e = GameWorld.enemies.get(i);
		e.draw(this);
		e.move();
	}
	sleep(0.03);
}
	}
	public void moveEnemies() {
		for(int i = 0;i<GameWorld.enemies.size();i++) {
			Enemy e = GameWorld.enemies.get(i);
			e.draw(this);
			e.move();
		}
	}
	
public void movePlayerBullet() {
	int i = 0;
	while(i<GameWorld.playerBullets.size()) {
		PlayerBullet b=GameWorld.playerBullets.get(i);
		b.draw(this);
		b.move();
	
		if(b.y<0) {
			GameWorld.playerBullets.remove(i);
		}else {
			i++;
		}
	}
	

}
};