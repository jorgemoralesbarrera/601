package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		
  private var FONDO_NEW:FONDO = new FONDO ();
  private var PISO_NEW:PISO = new PISO ();
  private var ANTAGONISTA_NEW:ANTAGONISTA = new ANTAGONISTA ();
  private var PROTAGONISTA_NEW:PROTAGONISTA = new PROTAGONISTA ();
  private var BALA_NEW:BALA = new BALA();
  //VARIABLE DE CLASE
  
  public function setup() {
   // constructor code
   addChild (FONDO_NEW);
   addChild (PISO_NEW);
   addChild (PROTAGONISTA_NEW);
   addChild (ANTAGONISTA_NEW);
   addChild (BALA_NEW);
   
   FONDO_NEW.y=0;
   FONDO_NEW.x=0;
   
   PISO_NEW.y=350;
   PISO_NEW.x=0;
   
   PROTAGONISTA_NEW.y=50;
   PROTAGONISTA_NEW.x=200;
   
   ANTAGONISTA_NEW.y=325;
   ANTAGONISTA_NEW.x=100;
   
   BALA_NEW.y=100;
   BALA_NEW.x=200;
   
   
   }
 }
 
}
		
		