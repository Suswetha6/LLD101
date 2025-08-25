class Cache implements ICache{
  private Frame lastFrame;
  
  @Override
  public void store(Frame frame) {
      this.lastFrame = frame;
  }

  @Override
  public Frame getLast() {
      return lastFrame;
  }
  
}
