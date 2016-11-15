package customToast;

import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.toast.R;

import org.w3c.dom.Text;

/**
 * Created by User on 11.11.2016.
 */

public class CustomToast extends Toast{
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param ctx The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public CustomToast(Activity ctx) {
        super(ctx);
        this.makeText(ctx, "Toast", Toast.LENGTH_SHORT);
        this.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
        this.layout = ctx.getLayoutInflater().inflate(R.layout.toast_layout, null);
        this.setView(layout);//setting the view of custom toast layout
    }

    private View layout;

    public TextView getTextView(){ return ((TextView)this.layout.findViewById(R.id.custom_toast_message));}
    public ImageView getImageView(){ return ((ImageView)this.layout.findViewById(R.id.custom_toast_image));}
    public LinearLayout getLinearLayout(){ return ((LinearLayout)this.layout.findViewById(R.id.custom_toast_layout));}


    public void setText(String s){
       getTextView().setText(s);
    }

    public void setImage(Drawable d){
       getImageView().setImageDrawable(d);
    }

}
