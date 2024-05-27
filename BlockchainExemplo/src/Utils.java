
public class Utils {

	public static String zeros(int length) {
		StringBuilder builder = new StringBuilder();
		
		for (int i=0; i<length;i++) {
			builder.append("0");
		}
		return builder.toString();
	}

    public static boolean containsBlock(Blockchain blockchain, String data) {
        for (Block block : blockchain.getBlocks()) {
            if (block.getData().contains(data)) {
                return true;
            }
        }
        return false;
    }

    public static Block findBlock(Blockchain blockchain, String data) {
        for (Block block : blockchain.getBlocks()) {
            if (block.getData().contains(data)) {
                return block;
            }
        }
        return null;
    }
}

