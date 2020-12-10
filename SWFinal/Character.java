public class Character //extends Tile
{

  
  //set up variables
  private String name;
  private boolean isJedi;
  private boolean isDroid;
  private boolean isHumanLike;
  private boolean isWookie;
  private boolean isDarkSide;
  private boolean isLightSide;
  private boolean isBountyHunter;
  private boolean isSmuggler;
  private int	kesselSpeed;
  private boolean isEmpire;
  private boolean isRebel;
  private boolean isResistance;
  private boolean isFirstOrder;
  private boolean isSeparatist;
  private boolean isGalacticRepublic;
  private boolean isEwok;
  private boolean	isFluffy;
  private boolean isSlimey;
  private String	lightSaberColor;
  private boolean isTall;
  private boolean isShort;
  private boolean isPilot;
  private boolean isAnnoying;
  private boolean	isCute;
  private boolean isBanderFav;
  private boolean	isGotButtWhooped;
  private boolean isInsideATauntaun;
  private boolean isStillLiving;
  private boolean	isLostALimb;
  private boolean isSpaceBallsCharacter;
//useless
  private boolean eliminated;
  private boolean showing;
  private String hidden;
    /*
    public Character(String Jedi, String Droid,	String HumanLike,String	Wookie,	String DarkSide, String LightSide,String	BountyHunter, String	Smuggler, String	KesselSpeed,String 	Empire, String	Rebel,	String Resistance,String	FirstOrder,	String Separatist,String	GalacticRepublic,String	Ewok	Fluffy	Slimey	Lightsaber Color	Tall	Short	Pilot	Annoying	Cute	Bander'sFav	GotButtWhooped	InsideATauntaun	StillLiving	LostALimb	SpaceBallsCharacter){
*/
  

  
  
//This is a massive constructor to take in all 30 characteristics as strings and set the objects boolean propertires(along with the integer kesselSpeed & String SaberColor) based on the string value

  public Character(String name, String isJedi, String isDroid, String isHumanLike,	String isWookie, String isDarkSide, String isLightSide, String isBountyHunter,	String isSmuggler, String	kesselSpeed, String isEmpire, String isRebel,	String isResistance,	String isFirstOrder, String isSeparatist, String isGalacticRepublic,String isEwok, String	isFluffy, String isSlimey, String	lightSaberColor, String isTall, String isShort, String isPilot, String isAnnoying, String	isCute,	String isBanderFav, String	isGotButtWhooped, String isInsideATauntaun, String isStillLiving, String isLostALimb, String isSpaceBallsCharacter){
    this.name = name;
    if (isJedi.equals("1")){
      this.isJedi = true;
    }
    else{
      this.isJedi = false;
    }

    if (isDroid.equals("1")){
      this.isDroid = true;
    }
    else{
      this.isDroid = false;
    }

    if (isHumanLike.equals("1")){
      this.isHumanLike = true;
    }
    else{
      this.isHumanLike = false;
    }

    if (isWookie.equals("1")){
      this.isWookie = true;
    }
    else{
      this.isWookie = false;
    }

    if (isDarkSide.equals("1")){
      this.isDarkSide = true;
    }
    else{
      this.isDarkSide = false;
    }
    
    if (isLightSide.equals("1")){
      this.isLightSide = true;
    }
    else{
      this.isLightSide = false;
    }
    
    if (isBountyHunter.equals("1")){
      this.isBountyHunter = true;
    }
    else{
      this.isBountyHunter = false;
    }
    
    if (isSmuggler.equals("1")){
      this.isSmuggler = true;
    }
    else{
      this.isSmuggler = false;
    }
    
    
    this.kesselSpeed = Integer.valueOf(kesselSpeed);
    

    if (isEmpire.equals("1")){
      this.isEmpire = true;
    }
    else{
      this.isEmpire = false;
    }
    
    if (isRebel.equals("1")){
      this.isRebel = true;
    }
    else{
      this.isRebel = false;
    }
    
    if (isResistance.equals("1")){
      this.isResistance = true;
    }
    else{
      this.isResistance = false;
    }
    
    if (isFirstOrder.equals("1")){
      this.isFirstOrder = true;
    }
    else{
      this.isFirstOrder = false;
    }
    
    if (isSeparatist.equals("1")){
      this.isSeparatist = true;
    }
    else{
      this.isSeparatist = false;
    }
    
    if (isGalacticRepublic.equals("1")){
      this.isGalacticRepublic = true;
    }
    else{
      this.isGalacticRepublic = false;
    }
    
    if (isEwok.equals("1")){
      this.isEwok = true;
    }
    else{
      this.isEwok = false;
    }
    
    if (isFluffy.equals("1")){
      this.isFluffy = true;
    }
    else{
      this.isFluffy = false;
    }
    
    if (isSlimey.equals("1")){
      this.isSlimey = true;
    }
    else{
      this.isSlimey = false;
    }
    
    
    
    this.lightSaberColor = lightSaberColor;
    
    
    if (isTall.equals("1")){
      this.isTall = true;
    }
    else{
      this.isTall = false;
    }
    
    if (isShort.equals("1")){
      this.isShort = true;
    }
    else{
      this.isShort = false;
    }
    
    if (isPilot.equals("1")){
      this.isPilot = true;
    }
    else{
      this.isPilot = false;
    }
    
    if (isAnnoying.equals("1")){
      this.isAnnoying = true;
    }
    else{
      this.isAnnoying = false;
    }
    
    if (isCute.equals("1")){
      this.isCute = true;
    }
    else{
      this.isCute = false;
    }
    
    if (isBanderFav.equals("1")){
      this.isBanderFav = true;
    }
    else{
      this.isBanderFav = false;
    }
    
    if (isGotButtWhooped.equals("1")){
      this.isGotButtWhooped = true;
    }
    else{
      this.isGotButtWhooped = false;
    }
    
    if (isInsideATauntaun.equals("1")){
      this.isInsideATauntaun = true;
    }
    else{
      this.isInsideATauntaun = false;
    }
    
    if (isStillLiving.equals("1")){
      this.isStillLiving = true;
    }
    else{
      this.isStillLiving = false;
    }
    
    if (isLostALimb.equals("1")){
      this.isLostALimb = true;
    }
    else{
      this.isLostALimb = false;
    }

    if (isSpaceBallsCharacter.equals("1")){
      this.isSpaceBallsCharacter = true;
    }
    else{
      this.isSpaceBallsCharacter = false;
    }
    
  //Getters to retrieve information---------------------------
  }

  public String getName(){
    return name;
  }

  public boolean getIsJedi(){
    return isJedi;
  }

  public boolean getIsDroid(){
    return isDroid;
  }

  public boolean getIsHumanLike(){
    return isHumanLike;
  }

  public boolean getIsWookie(){
    return isWookie;
  }

  public boolean getIsDarkSide(){
    return isDarkSide;
  }

  public boolean getIsLightSide(){
    return isLightSide;
  }

  public boolean getIsBountyHunter(){
    return isBountyHunter;
  }

  public boolean getIsSmuggler(){
    return isSmuggler;
  }

  public int getKesselSpeed(){
    return kesselSpeed;
  }

  public boolean getIsEmpire(){
    return isEmpire;
  }

  public boolean getIsRebel(){
    return isRebel;
  }

  public boolean getIsResistence(){
    return isResistance;
  }

  public boolean getIsSeparatist(){
    return isSeparatist;
  }

  public boolean getIsGR(){
    return isGalacticRepublic;
  }

  public boolean getIsEwok(){
    return isEwok;
  }

  public boolean getIsFluffy(){
    return isFluffy;
  }

  public boolean getIsSlimey(){
    return isSlimey;
  }

  public String getLSC(){
    return lightSaberColor;
  }

  public boolean getIsTall(){
    return isTall;
  }

  public boolean getIsShort(){
    return isShort;
  }

  public boolean getIsPilot(){
    return isAnnoying;
  }

  public boolean getIsCute(){
    return isCute;
  }

  public boolean getIsBF(){
    return isBanderFav;
  }

  public boolean getIsGBW(){
    return isGotButtWhooped;
  }

  public boolean getIsIAT(){
    return isInsideATauntaun;
  }

  public boolean getIsStillLiving(){
    return isStillLiving;
  }

  public boolean getIsLostALimb(){
    return isLostALimb;
  }

  public boolean getIsSBC(){
    return isSpaceBallsCharacter;
  }

  

  
  


// if the object is to be read in then it will return the name
  public String toString(){
    return name;
  }
  
} 