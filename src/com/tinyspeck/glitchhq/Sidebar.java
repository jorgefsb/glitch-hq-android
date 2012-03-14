package com.tinyspeck.glitchhq;

import java.util.ArrayList;
import java.util.Vector;

import android.app.Activity;
import android.view.View;
import android.widget.ScrollView;

import com.tinyspeck.glitchhq.BaseFragment.glitchActivity;

public class Sidebar {

	private SidebarListViewAdapter m_adapter;
	private LinearListView m_listView;

	private String m_actItemLast;

	private View m_root;
	private Activity m_activity;

	public class sidebarItem {
		 Boolean isHeader;
		 String text; 		  		 
 	 };
	
	private Vector<sidebarItem> m_sbList;

	public Sidebar(View root, Activity activity) {
		m_sbList = getSidebarList();

		m_activity = activity;
		m_adapter = new SidebarListViewAdapter(this, m_sbList);
		m_listView = (LinearListView) root.findViewById(R.id.SidebarListView);
		m_listView.setAdapter(m_adapter);
	}

	public Activity getActivity() {
		return m_activity;
	}

	protected boolean doesSupportRefresh() {
		return false;
	}

	protected boolean doesSupportMore() {
		return false;
	}

	protected void scrollToTop() {
		ScrollView sv = (ScrollView) m_root
				.findViewById(R.id.SidebarScrolLView);
		sv.smoothScrollTo(0, 0);
	}

	private Vector<sidebarItem> getSidebarList()
	{
		return new Vector<sidebarItem>() {
		
			private static final long serialVersionUID = -1411733025455724158L;
		{
			// Profile section
			add(new sidebarItem() {{
				isHeader = true;
				text = "Brady";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Profile";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Skills";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Achievements";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Auctions";
			}});
			
			// Activity section
			add(new sidebarItem() {{
				isHeader = true;
				text = "Activity";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Feed";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Messages";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Friends";
			}});
			
			// Settings section
			add(new sidebarItem() {{
				isHeader = true;
				text = " ";
			}});
			
			add(new sidebarItem() {{
				isHeader = false;
				text = "Settings";
			}});
		}}; 
	}
}
