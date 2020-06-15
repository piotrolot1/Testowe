
public enum  EStanPaliwa {

    PUSTY(1),
    POLOWA(2),
    PELNY(3),
    FULLMOTO(8);

    private int wspolczynikP;

    private EStanPaliwa(int wspolczynikPaliwa){
        this.wspolczynikP =wspolczynikPaliwa;
    }

    public int getWspolczynikPaliwa() {
        return this.wspolczynikP;
    }
}


//Mam juz enuma jteraz musze zrobic Interface z 1 stan baku pelny 2
//
//W i ruchPaliwa zrobic override 1 pod nazwa zurzycie paliwa i w cisnac mu polowa(2)
//
//Albo zroci normalnie tak jak wterdy ze quad ma 30/30 paliwa i potem  w ZurzyciePaliwa wstawi sie 30 - 15 =15 /30