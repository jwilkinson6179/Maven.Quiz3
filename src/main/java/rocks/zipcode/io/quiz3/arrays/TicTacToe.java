package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] gameBoard;

    public TicTacToe(String[][] board)
    {
        gameBoard = new String[3][3];

        for(Integer i = 0; i < gameBoard.length; i++)
        {
            for(Integer k = 0; k < gameBoard[i].length; k++)
            {
                gameBoard[i][k] = board[i][k];
            }
        }
    }

    public TicTacToe()
    {
        gameBoard = new String[3][3];

        for(Integer i = 0; i < gameBoard.length; i++)
        {
            for(Integer k = 0; k < gameBoard[i].length; k++)
            {
                gameBoard[i][k] = " ";
            }
        }
    }

    public String[] getRow(Integer value) {
        return gameBoard[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];

        column[0] = gameBoard[0][value];
        column[1] = gameBoard[1][value];
        column[2] = gameBoard[2][value];

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex)
    {
        String[] row = getRow(rowIndex);

        if(row[0] == row[1] && row[0] == row[2])
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] col = getColumn(columnIndex);

        if(col[0] == col[1] && col[0] == col[2])
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getWinner()
    {
        String winningPlayer = "";

        for(Integer i = 0; i < 3; i++)
        {
            if(isRowHomogenous(i))
            {
                winningPlayer = gameBoard[i][0];
                return winningPlayer;
            }
            else if(isColumnHomogeneous(i))
            {
                winningPlayer = gameBoard[0][i];
                return winningPlayer;
            }
        }

        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2])
        {
            return gameBoard[1][1];
        }
        else if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0])
        {
            return gameBoard[1][1];
        }
        return winningPlayer;
    }

    public String[][] getBoard() {
        return null;
    }
}
