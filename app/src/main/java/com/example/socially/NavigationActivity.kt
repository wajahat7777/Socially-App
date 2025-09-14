package com.example.socially

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NavigationActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val pageNumber = intent.getIntExtra("page", 1)
        
        when (pageNumber) {
            1 -> {
                setContentView(R.layout.page1)
                setupPage1()
            }
            2 -> {
                setContentView(R.layout.page2)
                setupPage2()
            }
            3 -> {
                setContentView(R.layout.page3)
                setupPage3()
            }
            4 -> {
                setContentView(R.layout.page4)
                setupPage4()
            }
            5 -> {
                setContentView(R.layout.page5)
                setupPage5()
            }
            6 -> {
                setContentView(R.layout.page6)
                setupPage6()
            }
            7 -> {
                setContentView(R.layout.page7)
                setupPage7()
            }
            8 -> {
                setContentView(R.layout.page8)
                setupPage8()
            }
            9 -> {
                setContentView(R.layout.page9)
                setupPage9()
            }
            10 -> {
                setContentView(R.layout.page10)
                setupPage10()
            }
            11 -> {
                setContentView(R.layout.page11)
                setupPage11()
            }
            12 -> {
                setContentView(R.layout.page12)
                setupPage12()
            }
            13 -> {
                setContentView(R.layout.page13)
                setupPage13()
            }
            14 -> {
                setContentView(R.layout.page14)
                setupPage14()
            }
            15 -> {
                setContentView(R.layout.page15)
                setupPage15()
            }
            16 -> {
                setContentView(R.layout.page16)
                setupPage16()
            }
            17 -> {
                setContentView(R.layout.page17)
                setupPage17()
            }
            18 -> {
                setContentView(R.layout.page18)
                setupPage18()
            }
            19 -> {
                setContentView(R.layout.page19)
                setupPage19()
            }
            20 -> {
                setContentView(R.layout.page20)
                setupPage20()
            }
            21 -> {
                setContentView(R.layout.page21)
                setupPage21()
            }
        }
    }
    
    private fun setupPage1() {
        findViewById<ImageView>(R.id.logoImageView)?.setOnClickListener {
            navigateToPage(2)
        }
    }
    
    private fun setupPage2() {
        findViewById<ImageView>(R.id.backArrowImageView)?.setOnClickListener {
            navigateToPage(1)
        }
        
        findViewById<Button>(R.id.createAccountButton)?.setOnClickListener {
            navigateToPage(3)
        }
    }
    
    private fun setupPage3() {
        findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<TextView>(R.id.switchAccountsTextView)?.setOnClickListener {
            navigateToPage(4)
        }
        
        val signupTextView = findViewById<TextView>(R.id.signupPromptTextView)
        signupTextView?.setOnClickListener {
            navigateToPage(2)
        }
        
        val fullText = "Don't have an account? Sign up."
        val spannableString = SpannableString(fullText)
        val signUpStart = fullText.indexOf("Sign up")
        val signUpEnd = signUpStart + "Sign up".length
        spannableString.setSpan(StyleSpan(Typeface.BOLD), signUpStart, signUpEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        signupTextView?.text = spannableString
    }
    
    private fun setupPage4() {
        findViewById<ImageView>(R.id.backArrowImageView)?.setOnClickListener {
            navigateToPage(3)
        }
        
        findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            navigateToPage(3)
        }
        
        findViewById<TextView>(R.id.forgotPasswordTextView)?.setOnClickListener {
            navigateToPage(2)
        }
        
        val signupTextView = findViewById<TextView>(R.id.signupPromptTextView)
        signupTextView?.setOnClickListener {
            navigateToPage(2)
        }
        
        val fullText = "Don't have an account? Sign up."
        val spannableString = SpannableString(fullText)
        val signUpStart = fullText.indexOf("Sign up")
        val signUpEnd = signUpStart + "Sign up".length
        spannableString.setSpan(android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#8B4513")), signUpStart, signUpEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        signupTextView?.text = spannableString
    }
    
    private fun setupPage5() {
        findViewById<ImageView>(R.id.cameraIconImageView)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<ImageView>(R.id.notificationBellImageView)?.setOnClickListener {
            navigateToPage(3)
        }
        
        findViewById<ImageView>(R.id.messageIconImageView)?.setOnClickListener {
            navigateToPage(8)
        }
        
        findViewById<ImageView>(R.id.likeIcon5)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.homeTabLayout)?.setOnClickListener {
            // Already on home page
        }
        
        findViewById<LinearLayout>(R.id.searchTabLayout)?.setOnClickListener {
            try {
                println("Search tab clicked - navigating to page 6")
                navigateToPage(6)
            } catch (e: Exception) {
                println("Error navigating to page 6: ${e.message}")
            }
        }
        
        findViewById<LinearLayout>(R.id.addTabLayout)?.setOnClickListener {
            navigateToPage(16)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.profileTabLayout)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<LinearLayout>(R.id.yourStoryLayout)?.setOnClickListener {
            navigateToPage(20)
        }
        
        findViewById<LinearLayout>(R.id.karennneStoryLayout)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<LinearLayout>(R.id.zackjohnStoryLayout)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<LinearLayout>(R.id.kieronStoryLayout)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<LinearLayout>(R.id.craigStoryLayout)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<ImageView>(R.id.joshuaProfileIcon)?.setOnClickListener {
            navigateToPage(21)
        }
    }
    
    private fun setupPage6() {
        try {
            println("Setting up page 6...")
            
            findViewById<LinearLayout>(R.id.searchRow)?.setOnClickListener {
                navigateToPage(7)
            }
            
            findViewById<LinearLayout>(R.id.homeTabLayout)?.setOnClickListener {
                navigateToPage(5)
            }
            
            findViewById<LinearLayout>(R.id.searchTabLayout)?.setOnClickListener {
                // Already on search page
            }
            
            findViewById<LinearLayout>(R.id.addTabLayout)?.setOnClickListener {
                navigateToPage(16)
            }
            
            findViewById<LinearLayout>(R.id.activityTabLayout)?.setOnClickListener {
                navigateToPage(11)
            }
            
            findViewById<LinearLayout>(R.id.profileTabLayout)?.setOnClickListener {
                navigateToPage(13)
            }
            
            println("Page 6 setup completed successfully")
        } catch (e: Exception) {
            println("Error setting up page 6: ${e.message}")
        }
    }
    
    private fun setupPage7() {
        findViewById<LinearLayout>(R.id.clearButtonLayout)?.setOnClickListener {
            navigateToPage(6)
        }
    }
    
    private fun setupPage8() {
        findViewById<ImageView>(R.id.backArrow8)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.messageRow1)?.setOnClickListener {
            navigateToPage(9)
        }
        
        findViewById<LinearLayout>(R.id.messageRow2)?.setOnClickListener {
            navigateToPage(9)
        }
        
        findViewById<LinearLayout>(R.id.messageRow3)?.setOnClickListener {
            navigateToPage(9)
        }
        
        findViewById<LinearLayout>(R.id.messageRow4)?.setOnClickListener {
            navigateToPage(9)
        }
        
        findViewById<LinearLayout>(R.id.messageRow5)?.setOnClickListener {
            navigateToPage(9)
        }
        
        findViewById<LinearLayout>(R.id.messageRow6)?.setOnClickListener {
            navigateToPage(9)
        }
    }
    
    private fun setupPage9() {
        findViewById<ImageView>(R.id.backArrow9)?.setOnClickListener {
            navigateToPage(8)
        }
        
        findViewById<ImageView>(R.id.videoIcon9)?.setOnClickListener {
            navigateToPage(10)
        }
    }
    
    private fun setupPage10() {
        findViewById<ImageView>(R.id.endCallButton10)?.setOnClickListener {
            navigateToPage(9)
        }
    }
    
    private fun setupPage11() {
        findViewById<TextView>(R.id.followingTab11)?.setOnClickListener {
            // Already on following tab, stay on page 11
        }
        
        findViewById<TextView>(R.id.youTab11)?.setOnClickListener {
            navigateToPage(12)
        }
        
        val bottomNav11 = findViewById<LinearLayout>(R.id.bottomNavigationLayout11)
        bottomNav11?.getChildAt(0)?.setOnClickListener {
            navigateToPage(5)
        }
        
        bottomNav11?.getChildAt(1)?.setOnClickListener {
            navigateToPage(6)
        }
        
        bottomNav11?.getChildAt(2)?.setOnClickListener {
            navigateToPage(2)
        }
        
        bottomNav11?.getChildAt(3)?.setOnClickListener {
            // Already on activity page
        }
        
        bottomNav11?.getChildAt(4)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<FrameLayout>(R.id.karennneProfileIcons11)?.setOnClickListener {
            navigateToPage(21)
        }
        
        findViewById<FrameLayout>(R.id.kieroJhonProfileIcons11)?.setOnClickListener {
            navigateToPage(21)
        }
        
        findViewById<FrameLayout>(R.id.maxZackProfileIcons11)?.setOnClickListener {
            navigateToPage(21)
        }
    }
    
    private fun setupPage12() {
        findViewById<TextView>(R.id.followingTab12)?.setOnClickListener {
            navigateToPage(11)
        }
        
        val bottomNav12 = findViewById<LinearLayout>(R.id.bottomNavigationLayout12)
        bottomNav12?.getChildAt(0)?.setOnClickListener {
            navigateToPage(5)
        }
        
        bottomNav12?.getChildAt(1)?.setOnClickListener {
            navigateToPage(6)
        }
        
        bottomNav12?.getChildAt(2)?.setOnClickListener {
            navigateToPage(2)
        }
        
        bottomNav12?.getChildAt(3)?.setOnClickListener {
            navigateToPage(11)
        }
        
        bottomNav12?.getChildAt(4)?.setOnClickListener {
            navigateToPage(13)
        }
    }
    
    private fun setupPage13() {
        findViewById<ImageView>(R.id.menu)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id.profileIcon13)?.setOnClickListener {
            navigateToPage(20)
        }
        
        findViewById<ImageView>(R.id.profilePicture)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<TextView>(R.id.editProfileButton)?.setOnClickListener {
            navigateToPage(15)
        }
        
        findViewById<LinearLayout>(R.id.homeTabLayout13)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.searchTabLayout13)?.setOnClickListener {
            navigateToPage(6)
        }
        
        findViewById<LinearLayout>(R.id.addTabLayout13)?.setOnClickListener {
            navigateToPage(16)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout13)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.profileTabLayout13)?.setOnClickListener {
            // Already on profile page
        }
        
        findViewById<LinearLayout>(R.id.friendsHighlightLayout)?.setOnClickListener {
            navigateToPage(14)
        }
        
        findViewById<LinearLayout>(R.id.sportHighlightLayout)?.setOnClickListener {
            navigateToPage(14)
        }
        
        findViewById<LinearLayout>(R.id.designHighlightLayout)?.setOnClickListener {
            navigateToPage(14)
        }
    }
    
    private fun setupPage14() {
        findViewById<ImageView>(R.id.closeButton)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout14)?.setOnClickListener {
            // Already on activity (story viewer)
        }
        
        findViewById<LinearLayout>(R.id.createTabLayout14)?.setOnClickListener {
            navigateToPage(2)
        }
        
        findViewById<LinearLayout>(R.id.createPostTabLayout14)?.setOnClickListener {
            navigateToPage(2)
        }
        
        findViewById<LinearLayout>(R.id.browseTabLayout14)?.setOnClickListener {
            navigateToPage(6)
        }
        
        findViewById<LinearLayout>(R.id.sendTabLayout14)?.setOnClickListener {
            navigateToPage(8)
        }
        
        findViewById<LinearLayout>(R.id.moreTabLayout14)?.setOnClickListener {
            navigateToPage(11)
        }
    }
    
    private fun setupPage15() {
        findViewById<TextView>(R.id.cancelButton)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<TextView>(R.id.doneButton)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<TextView>(R.id.changePhotoButton)?.setOnClickListener {
            navigateToPage(2)
        }
        
        findViewById<TextView>(R.id.switchToProfessionalButton)?.setOnClickListener {
            navigateToPage(11)
        }
    }
    
    private fun setupPage16() {
        findViewById<TextView>(R.id.cancelButton16)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<TextView>(R.id.nextButton16)?.setOnClickListener {
            navigateToPage(15)
        }
        
        findViewById<LinearLayout>(R.id.libraryTab16)?.setOnClickListener {
            // Already on library tab - stay on page 16
        }
        
        findViewById<LinearLayout>(R.id.photoTab16)?.setOnClickListener {
            navigateToPage(17)
        }
        
        findViewById<LinearLayout>(R.id.videoTab16)?.setOnClickListener {
            navigateToPage(6)
        }
    }
    
    private fun setupPage17() {
        findViewById<ImageView>(R.id.topRightChevron17)?.setOnClickListener {
            navigateToPage(16)
        }
        
        findViewById<ImageView>(R.id.captureButton17)?.setOnClickListener {
            navigateToPage(19)
        }
    }
    
    private fun setupPage18() {
        findViewById<ImageView>(R.id.closeButton18)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id.sendMessageIcon18)?.setOnClickListener {
            navigateToPage(8)
        }
        
        findViewById<ImageView>(R.id.moreOptionsIcon18)?.setOnClickListener {
            navigateToPage(11)
        }
    }
    
    private fun setupPage19() {
        findViewById<ImageView>(R.id.closeButton19)?.setOnClickListener {
            navigateToPage(17)
        }
        
        findViewById<ImageView>(R.id.sendButton19)?.setOnClickListener {
            navigateToPage(13)
        }
    }
    
    private fun setupPage20() {
        findViewById<ImageView>(R.id.closeButton20)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<LinearLayout>(R.id.activityButton20)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.createButton20)?.setOnClickListener {
            navigateToPage(17)
        }
        
        findViewById<LinearLayout>(R.id.facebookButton20)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.highlightButton20)?.setOnClickListener {
            navigateToPage(13)
        }
        
        findViewById<LinearLayout>(R.id.moreButton20)?.setOnClickListener {
            navigateToPage(13)
        }
    }
    
    private fun setupPage21() {
        findViewById<ImageView>(R.id.backButton21)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id.menuButton21)?.setOnClickListener {
            navigateToPage(18)
        }
        
        findViewById<LinearLayout>(R.id.followingButton21)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.messageButton21)?.setOnClickListener {
            navigateToPage(8)
        }
        
        findViewById<LinearLayout>(R.id.emailButton21)?.setOnClickListener {
            navigateToPage(15)
        }
        
        findViewById<ImageView>(R.id.addButton21)?.setOnClickListener {
            navigateToPage(8)
        }
        
        findViewById<LinearLayout>(R.id.gridTab21)?.setOnClickListener {
            // Grid view is already selected - no action needed
        }
        
        findViewById<LinearLayout>(R.id.personTagTab21)?.setOnClickListener {
            navigateToPage(21)
        }
        
        findViewById<LinearLayout>(R.id.homeButton21)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.searchButton21)?.setOnClickListener {
            navigateToPage(6)
        }
        
        findViewById<LinearLayout>(R.id.createPostButton21)?.setOnClickListener {
            navigateToPage(17)
        }
        
        findViewById<LinearLayout>(R.id.activityButton21)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.profileButton21)?.setOnClickListener {
            navigateToPage(13)
        }
    }
    
    private fun navigateToPage(pageNumber: Int) {
        val intent = Intent(this, NavigationActivity::class.java)
        intent.putExtra("page", pageNumber)
        startActivity(intent)
        finish() // Close current activity
    }
}
