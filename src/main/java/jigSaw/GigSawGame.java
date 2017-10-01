package jigSaw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayan on 11/9/17.
 */
public class GigSawGame {
    List<Block> cornerBoxList = new ArrayList<>();
    List<Block> edgeBoxList = new ArrayList<>();
    List<Block> middleBoxList = new ArrayList<>();

    private void initialise(){
        Block block = new Block();
        block.setBlockType(BlockType.CORNER);
        block.setLeft(Direction.NEGATIVE);
    }

}
