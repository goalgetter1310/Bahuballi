package com.firebaseplayer.databinding;
import com.firebaseplayer.R;
import com.firebaseplayer.BR;
import android.view.View;
public class ActivityHomeBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.home_iv_drawer_menu, 2);
        sViewsWithIds.put(R.id.tv_header_title, 3);
        sViewsWithIds.put(R.id.main_fragment_container, 4);
        sViewsWithIds.put(R.id.main_ll_drawer_main, 5);
        sViewsWithIds.put(R.id.home_profile_rl, 6);
        sViewsWithIds.put(R.id.rv_navigation_item, 7);
    }
    // views
    public final android.widget.ImageView homeIvDrawerMenu;
    public final android.widget.ImageView homeProfileRl;
    public final android.support.v4.widget.DrawerLayout mainDrawerLayout;
    public final android.widget.FrameLayout mainFragmentContainer;
    public final android.widget.LinearLayout mainLlDrawerMain;
    public final android.support.v7.widget.RecyclerView rvNavigationItem;
    public final android.support.v7.widget.Toolbar toolbar;
    public final com.firebaseplayer.widget.CustomTextView tvHeaderTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.homeIvDrawerMenu = (android.widget.ImageView) bindings[2];
        this.homeProfileRl = (android.widget.ImageView) bindings[6];
        this.mainDrawerLayout = (android.support.v4.widget.DrawerLayout) bindings[0];
        this.mainDrawerLayout.setTag(null);
        this.mainFragmentContainer = (android.widget.FrameLayout) bindings[4];
        this.mainLlDrawerMain = (android.widget.LinearLayout) bindings[5];
        this.rvNavigationItem = (android.support.v7.widget.RecyclerView) bindings[7];
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[1];
        this.tvHeaderTitle = (com.firebaseplayer.widget.CustomTextView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityHomeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityHomeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHomeBinding>inflate(inflater, com.firebaseplayer.R.layout.activity_home, root, attachToRoot, bindingComponent);
    }
    public static ActivityHomeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityHomeBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.firebaseplayer.R.layout.activity_home, null, false), bindingComponent);
    }
    public static ActivityHomeBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityHomeBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_home_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHomeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}