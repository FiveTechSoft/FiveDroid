public class Harbour {
        
    public Activity activity;
        
    static { 
        System.loadLibrary( "harbour" );
    }

    public Harbour( Activity act ) {
        activity = act; 
    }

    public native void vmInit( int i );

    public native void HandleEvent( String eventName, View view );

    public void MsgInfo( String cMsg )
    {
        AlertDialog alertDialog = new AlertDialog.Builder( activity ).create();
        alertDialog.setTitle( "Information" );
        alertDialog.setMessage( cMsg );
        Message TRUE = null;
        alertDialog.setButton( "OK", TRUE );
        
        alertDialog.show();     
    }
    
    public String ControlGetText( Object view )
    {
    	
    	if( view.getClass() == ( new Button( activity ) ).getClass() )	
    	{
    		return ( ( Button ) view ).getText().toString();
    	}
    	else
    		return view.getClass().getName(); 
    }
}
