import java.util.List;

public enum EWspolczynikZdrowia {

        TANK(2),
        ASSAIN(4),
        MAG(6),
        HEALER(8);

        private int wspolczynik;

        private EWspolczynikZdrowia(int wspolczynik){
            this.wspolczynik = wspolczynik;
        }
        public int getWspolczynik() {
            return this.wspolczynik;
        }
    }