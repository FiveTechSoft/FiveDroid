package fivetech.tutor01;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.app.AlertDialog;

public class tutor01 extends Activity {
        
        public Harbour harbour;
        
        /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                
        harbour = new Harbour( this );
        harbour.vmInit( 1 );
        
        setContentView( R.layout.main );
    }
    
    public void MsgInfo( String cMsg )
    {
        AlertDialog alertDialog = new AlertDialog.Builder( this ).create();
        alertDialog.setTitle( "Information" );
        alertDialog.setMessage( cMsg );
        Message TRUE = null;
        alertDialog.setButton( "OK", TRUE );
        
        alertDialog.show();     
    }
    
    public void OnClick( View view )
    {
        harbour.HandleEvent( "OnClick", view );
    }   
}
