
public class PlayerBullet extends Character{

    
    public void draw(MyFrame f) {
        f.setColor(0, 0, 0);
        f.fillRect(x+10, y, 10, 30);
    }
    
	public PlayerBullet(double x, double y, double vx, double vy) {
		//Characterクラスのコンストラクタ呼び出し(8章)
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

}