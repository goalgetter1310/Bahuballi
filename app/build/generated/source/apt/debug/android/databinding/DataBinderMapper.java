
package android.databinding;
import com.firebaseplayer.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 15;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.firebaseplayer.R.layout.activity_profile:
                    return com.firebaseplayer.databinding.ActivityProfileBinding.bind(view, bindingComponent);
                case com.firebaseplayer.R.layout.frg_more:
                    return com.firebaseplayer.databinding.FrgMoreBinding.bind(view, bindingComponent);
                case com.firebaseplayer.R.layout.activity_home:
                    return com.firebaseplayer.databinding.ActivityHomeBinding.bind(view, bindingComponent);
                case com.firebaseplayer.R.layout.row_nav_item:
                    return com.firebaseplayer.databinding.RowNavItemBinding.bind(view, bindingComponent);
                case com.firebaseplayer.R.layout.row_more_item:
                    return com.firebaseplayer.databinding.RowMoreItemBinding.bind(view, bindingComponent);
                case com.firebaseplayer.R.layout.frg_home:
                    return com.firebaseplayer.databinding.FrgHomeBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 366786799: {
                if(tag.equals("layout/activity_profile_0")) {
                    return com.firebaseplayer.R.layout.activity_profile;
                }
                break;
            }
            case 1162045807: {
                if(tag.equals("layout/frg_more_0")) {
                    return com.firebaseplayer.R.layout.frg_more;
                }
                break;
            }
            case 293647131: {
                if(tag.equals("layout/activity_home_0")) {
                    return com.firebaseplayer.R.layout.activity_home;
                }
                break;
            }
            case 1327677866: {
                if(tag.equals("layout/row_nav_item_0")) {
                    return com.firebaseplayer.R.layout.row_nav_item;
                }
                break;
            }
            case 1469487716: {
                if(tag.equals("layout/row_more_item_0")) {
                    return com.firebaseplayer.R.layout.row_more_item;
                }
                break;
            }
            case 1018751097: {
                if(tag.equals("layout/frg_home_0")) {
                    return com.firebaseplayer.R.layout.frg_home;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"};
    }
}