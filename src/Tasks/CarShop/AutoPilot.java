package Tasks.CarShop;

  public interface AutoPilot extends AutoPark {
      public boolean hasAutoPilot = false;


        abstract void selfDrive();

      @Override
      public  void autoPark();
  }
