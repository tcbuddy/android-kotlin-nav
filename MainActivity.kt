package com.cfsuman.kotlinexamples

import android.support.v7.app.AppCompatActivity

import android.os.Bundle

import android.graphics.Color

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        /*

            *** reference source developer.android.com ***

            BottomNavigationView

                Represents a standard bottom navigation bar for application.

                Bottom navigation bars make it easy for users to explore and switch between

                top-level views in a single tap. It should be used when application has

                three to five top-level destinations.

                The bar contents can be populated by specifying a menu resource file. Each menu

                item title, icon and enabled state will be used for displaying bottom navigation

                bar items. Menu items can also be used for programmatically selecting which

                destination is currently active. It can be done using MenuItem#setChecked(true)

        */

        // Set a navigation item selected listener for bottom navigation view

        bottom_navigation_view.setOnNavigationItemSelectedListener {

            when(it.itemId){

                R.id.attach_file -> {

                    text_view.text = "Attach File Clicked."

                    true

                }

                R.id.delete -> {

                    text_view.text = "Delete Clicked."

                    true

                }R.id.insert_chart -> {

                text_view.text = "Insert Chart Clicked."

                true

                }R.id.insert_link -> {

                    text_view.text = "Insert Link Clicked."

                    true

                }R.id.backup ->{

                    text_view.text = "Backup Clicked."

                    true

                }else -> false

            }

        }

        // Set a navigation item re selected listener for bottom navigation view

        bottom_navigation_view.setOnNavigationItemReselectedListener {

            when(it.itemId){

                R.id.attach_file -> text_view.text = "Reselected Attach File."

                R.id.delete -> text_view.text = "Reselected Delete."

                R.id.insert_chart -> text_view.text = "Reselected Insert Chart."

                R.id.insert_link -> text_view.text = "Reselected Insert Link."

                R.id.backup ->text_view.text = "Reselected Backup."

            }

        }

        // Set a click listener for root layout

        root_layout.setOnClickListener{

            // Programmatically select bottom navigation bar menu item

            bottom_navigation_view.menu.getItem(3).isChecked = true

            text_view.text = "Programmatically Selected  Insert Link."

        }

        // Set the bottom navigation view/bar background color

        bottom_navigation_view.setBackgroundColor(Color.YELLOW)

    }

}
