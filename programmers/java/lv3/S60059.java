package programmers.java.lv3;

public class S60059 {

    private int[][] BINARY_KEYS;
    private int[] BINARY_LOCK;
    private int UNLOCKED_BINARY_BUFFER;

    private int KEY_LENGTH;
    private int LOCK_LENGTH;
    
    public static void main(String[] args) {
        S60059 sol = new S60059();
        boolean result = sol.solution(new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}}, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}});
        System.out.println(result);
    }

    public boolean solution(int[][] key, int[][] lock) {

        KEY_LENGTH = key.length;
        LOCK_LENGTH = lock.length;
        
        UNLOCKED_BINARY_BUFFER = (1 << LOCK_LENGTH) - 1;

        BINARY_LOCK = new int[LOCK_LENGTH];

        for(int i = 0; i < LOCK_LENGTH; i++) {
            BINARY_LOCK[i] = StringArrayToBinary(lock[i]);
        }

        BINARY_KEYS = new int[4][KEY_LENGTH];

        for(int rot = 0; rot < 4; rot++) {
            for(int i = 0; i < KEY_LENGTH; i++) {
                BINARY_KEYS[rot][i] = StringArrayToBinary(key[i]);
            }
            key = rotate(key);
        }

        for (int rowMargin = -KEY_LENGTH + 1; rowMargin < LOCK_LENGTH; rowMargin++) {
            for (int colMargin = -KEY_LENGTH + 1; colMargin < LOCK_LENGTH; colMargin++) {
                if (unLock(rowMargin, colMargin)) return true;
            }
        }

        return false;
    }

    private boolean unLock(int rowMargin, int colMargin) {

        int mask = (1 << LOCK_LENGTH) - 1;
        mask = colMargin < 0 ? mask >> -colMargin << -colMargin : mask >> colMargin;

        boolean check = true;
        
        for(int rot = 0; rot < 4; rot++) {
            
            for(int row = 0, keyRow = -rowMargin; row < LOCK_LENGTH; row++, keyRow++) {
                
                int binaryKeyBuffer = keyRow < KEY_LENGTH && keyRow >= 0 ? BINARY_KEYS[rot][keyRow] : 0;

                int gap = LOCK_LENGTH - KEY_LENGTH - colMargin;
                if(gap < 0) binaryKeyBuffer >>= -gap;
                else binaryKeyBuffer <<= gap;

                binaryKeyBuffer &= mask;
                
                if((binaryKeyBuffer ^ BINARY_LOCK[row]) != UNLOCKED_BINARY_BUFFER) {
                    check = false;
                    break;
                }
            }
            
            if(check) return true;
        }

        return false;
    }

    private int[][] rotate(int[][] arr) {
        
        final int LENGTH = arr.length;
        final int[][] RET_ARR = new int[LENGTH][LENGTH];

        for(int row = 0; row < LENGTH; row++) {
            for(int col = 0; col < LENGTH; col++) {
                RET_ARR[col][LENGTH - row - 1] = arr[row][col];
            }
        }

        return RET_ARR;
    }

    private int StringArrayToBinary(int[] arr) {
        
        final int LENGTH = arr.length;
        int binary = 0;
        
        for(int i = 0; i < LENGTH; i++) {
            binary += arr[i] << (LENGTH - i - 1);
        }
        
        return binary;
    }
}
