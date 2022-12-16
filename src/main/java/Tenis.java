public class Tenis {
    private final String player1Name;
    private final String player2Name;
    private int playerOneMarcador;
    private int playerTwoMarcador;

    public Tenis(String player1Name, String player2Name ) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }


    public String getScore() {
        if (playerOneMarcador == playerTwoMarcador) {
            if (playerOneMarcador > 2) {
                return "Empate";
            } else {
                return getScore(playerOneMarcador) + "Todos ";
            }

        } else {
            if (Math.max(playerOneMarcador, playerTwoMarcador) > 3) {
                int diferenciaDePuntos = Math.abs(playerOneMarcador-playerTwoMarcador);
                if (diferenciaDePuntos == 1) {
                return "Ventaja de " + (playerOneMarcador > playerTwoMarcador ? player1Name : player2Name);
            } else {
                    return "Juego de " + (playerOneMarcador > playerTwoMarcador ? player1Name : player2Name);
                }
            } else {
                return getScore(playerOneMarcador) + " " + getScore(playerTwoMarcador);
            }
        }

    }

    public String getScore(int punto) {
        if (punto == 0) {
            return "Cero  ";
        } else if (punto == 1) {
            return "Quince ";
        } else if (punto == 2) {
            return "Treinta  ";
        } else {
            return "Cuarenta  ";
        }
    }

    public void playerOnePuntua() {
        playerOneMarcador++;
    }

    public void playerTwoPuntua() {
        playerTwoMarcador++;
    }
}

    

