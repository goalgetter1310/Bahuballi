package com.firebaseplayer.databinding;
import com.firebaseplayer.R;
import com.firebaseplayer.BR;
import android.view.View;
public class RowNavItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_background, 1);
        sViewsWithIds.put(R.id.ic_icon, 2);
        sViewsWithIds.put(R.id.tv_text_title, 3);
    }
    // views
    public final android.widget.ImageView icIcon;
    public final android.widget.LinearLayout llClick;
    public final android.widget.RelativeLayout rlBackground;
    public final com.firebaseplayer.widget.CustomTextView tvTextTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowNavItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.icIcon = (android.widget.ImageView) bindings[2];
        this.llClick = (android.widget.LinearLayout) bindings[0];
        this.llClick.setTag(null);
        this.rlBackground = (android.widget.RelativeLayout) bindings[1];
        this.tvTextTitle = (com.firebaseplayer.widget.CustomTextView) bindings[3];
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

    public static RowNavItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RowNavItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<RowNavItemBinding>inflate(inflater, com.firebaseplayer.R.layout.row_nav_item, root, attachToRoot, bindingComponent);
    }
    public static RowNavItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RowNavItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.firebaseplayer.R.layout.row_nav_item, null, false), bindingComponent);
    }
    public static RowNavItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RowNavItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/row_nav_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new RowNavItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}