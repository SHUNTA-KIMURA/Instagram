import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class postAdapter extends ArrayAdapter<Post> {
    List<Post> mPosts;
    public postAdapter(Context context,int layoutResourceId,List<Post> objects){
        super(context,layoutResourceId,objects);

        mPosts=objects;
    }

    @Override
    public int getCount(){
        return mPosts.size();
    }

    @Override
    public Post getItem(int position){
        return mPosts.get(position);
    }

    public static class ViewHolder{

    }
}
