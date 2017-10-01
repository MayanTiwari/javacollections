package jigSaw;

/**
 * Created by mayan on 10/9/17.
 */
public class Block {
    public BlockType getBlockType() {
        return blockType;
    }

    public void setBlockType(BlockType blockType) {
        this.blockType = blockType;
    }

    public Direction getLeft() {
        return left;
    }

    public void setLeft(Direction left) {
        this.left = left;
    }

    public Direction getRight() {
        return right;
    }

    public void setRight(Direction right) {
        this.right = right;
    }

    public Direction getTop() {
        return top;
    }

    public void setTop(Direction top) {
        this.top = top;
    }

    public Direction getBottom() {
        return bottom;
    }

    public void setBottom(Direction bottom) {
        this.bottom = bottom;
    }

    private BlockType blockType;
    Direction left ;
    Direction right ;
    Direction top ;
    Direction bottom ;
    public boolean isLeftMatch(Block one,Block two){
        return true;
    }
    public boolean isRightMatch(Block one,Block two){
        return true;
    }
    public boolean isTopMatch(Block one,Block two){
        return true;
    }
    public boolean isBottomMatch(Block one,Block two){
        return true;
    }
}
