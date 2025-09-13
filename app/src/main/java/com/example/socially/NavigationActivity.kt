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
        
        // Get the page number from intent
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
        // Page 1 - Logo click navigation to page 2
        findViewById<ImageView>(R.id.logoImageView)?.setOnClickListener {
            navigateToPage(2)
        }
    }
    
    private fun setupPage2() {
        // Back arrow navigation
        findViewById<ImageView>(R.id.backArrowImageView)?.setOnClickListener {
            navigateToPage(1)
        }
        
        // Create Account button navigation
        findViewById<Button>(R.id.createAccountButton)?.setOnClickListener {
            // Navigate to page 3 (create account form)
            navigateToPage(3)
        }
    }
    
    private fun setupPage3() {
        // Login button navigation
        findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            // Navigate to page 5 (home page)
            navigateToPage(5)
        }
        
        // Switch accounts navigation
        findViewById<TextView>(R.id.switchAccountsTextView)?.setOnClickListener {
            // Navigate to page 4 (login with input fields)
            navigateToPage(4)
        }
        
        // Sign up navigation with bold text
        val signupTextView = findViewById<TextView>(R.id.signupPromptTextView)
        signupTextView?.setOnClickListener {
            // Navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        // Make "Sign up" text bold
        val fullText = "Don't have an account? Sign up."
        val spannableString = SpannableString(fullText)
        val signUpStart = fullText.indexOf("Sign up")
        val signUpEnd = signUpStart + "Sign up".length
        spannableString.setSpan(StyleSpan(Typeface.BOLD), signUpStart, signUpEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        signupTextView?.text = spannableString
    }
    
    private fun setupPage4() {
        // Back arrow navigation
        findViewById<ImageView>(R.id.backArrowImageView)?.setOnClickListener {
            navigateToPage(3)
        }
        
        // Login button navigation
        findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            // Navigate to page 3 (login form)
            navigateToPage(3)
        }
        
        // Forgot password navigation
        findViewById<TextView>(R.id.forgotPasswordTextView)?.setOnClickListener {
            // Here you would typically show forgot password dialog
            // For now, let's navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        // Sign up navigation with mixed colors
        val signupTextView = findViewById<TextView>(R.id.signupPromptTextView)
        signupTextView?.setOnClickListener {
            // Navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        // Make "Sign up" text darker color
        val fullText = "Don't have an account? Sign up."
        val spannableString = SpannableString(fullText)
        val signUpStart = fullText.indexOf("Sign up")
        val signUpEnd = signUpStart + "Sign up".length
        spannableString.setSpan(android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#8B4513")), signUpStart, signUpEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        signupTextView?.text = spannableString
    }
    
    private fun setupPage5() {
        // Camera icon navigation (profile icon for stories)
        findViewById<ImageView>(R.id.cameraIconImageView)?.setOnClickListener {
            // Navigate to page 18 (story viewer)
            navigateToPage(18)
        }
        
        // Notification bell navigation
        findViewById<ImageView>(R.id.notificationBellImageView)?.setOnClickListener {
            // Here you would typically show notifications
            // For now, let's navigate to page 3 (profile login)
            navigateToPage(3)
        }
        
        // Message icon navigation
        findViewById<ImageView>(R.id.messageIconImageView)?.setOnClickListener {
            // Navigate to page 8 (messages list)
            navigateToPage(8)
        }
        
        // Like icon navigation
        findViewById<ImageView>(R.id.likeIcon5)?.setOnClickListener {
            // Navigate to page 11 (activity)
            navigateToPage(11)
        }
        
        // Bottom navigation tabs
        findViewById<LinearLayout>(R.id.homeTabLayout)?.setOnClickListener {
            // Already on home page
        }
        
        // Search tab navigation - testing with simplified page 6
        findViewById<LinearLayout>(R.id.searchTabLayout)?.setOnClickListener {
            try {
                println("Search tab clicked - navigating to page 6")
                navigateToPage(6)
            } catch (e: Exception) {
                println("Error navigating to page 6: ${e.message}")
            }
        }
        
        findViewById<LinearLayout>(R.id.addTabLayout)?.setOnClickListener {
            // Navigate to media picker for creating posts
            navigateToPage(16)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout)?.setOnClickListener {
            // Navigate to page 11 (activity screen)
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.profileTabLayout)?.setOnClickListener {
            // Navigate to page 13 (profile page)
            navigateToPage(13)
        }
        
        // Story navigation - first story (Your Story) navigates to page 20
        findViewById<LinearLayout>(R.id.yourStoryLayout)?.setOnClickListener {
            navigateToPage(20)
        }
        
        // Other story profiles navigate to page 18
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
        
        // Post profile icon navigates to page 21
        findViewById<ImageView>(R.id.joshuaProfileIcon)?.setOnClickListener {
            navigateToPage(21)
        }
    }
    
    private fun setupPage6() {
        try {
            // Simplified setupPage6 to avoid crashes
            println("Setting up page 6...")
            
            // Search bar navigation - clicking on search bar takes to page 7
            findViewById<LinearLayout>(R.id.searchRow)?.setOnClickListener {
                navigateToPage(7)
            }
            
            // Bottom navigation tabs
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
        // Clear button navigation - goes back to page 6
        findViewById<LinearLayout>(R.id.clearButtonLayout)?.setOnClickListener {
            navigateToPage(6)
        }
    }
    
    private fun setupPage8() {
        // Messages list page - basic navigation
        // Back button navigation
        findViewById<ImageView>(R.id.backArrow8)?.setOnClickListener {
            navigateToPage(5)
        }
        
        // Message row navigation - clicking on any message takes to page 9
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
        // Chat detail page - basic navigation
        findViewById<ImageView>(R.id.backArrow9)?.setOnClickListener {
            navigateToPage(8)
        }
        
        // Video icon navigation
        findViewById<ImageView>(R.id.videoIcon9)?.setOnClickListener {
            navigateToPage(10)
        }
    }
    
    private fun setupPage10() {
        // Call screen page - basic navigation
        findViewById<ImageView>(R.id.endCallButton10)?.setOnClickListener {
            navigateToPage(9)
        }
    }
    
    private fun setupPage11() {
        // Activity screen - basic navigation
        // Following tab - stays on page 11
        findViewById<TextView>(R.id.followingTab11)?.setOnClickListener {
            // Already on following tab, stay on page 11
        }
        
        // You tab - navigates to page 12
        findViewById<TextView>(R.id.youTab11)?.setOnClickListener {
            navigateToPage(12)
        }
        
        // Bottom navigation - Home icon (first ImageView in bottomNavigationLayout11)
        val bottomNav11 = findViewById<LinearLayout>(R.id.bottomNavigationLayout11)
        bottomNav11?.getChildAt(0)?.setOnClickListener {
            navigateToPage(5)
        }
        
        // Bottom navigation - Search icon (second ImageView in bottomNavigationLayout11)
        bottomNav11?.getChildAt(1)?.setOnClickListener {
            navigateToPage(6)
        }
        
        // Bottom navigation - Add icon (third ImageView in bottomNavigationLayout11)
        bottomNav11?.getChildAt(2)?.setOnClickListener {
            navigateToPage(2)
        }
        
        // Bottom navigation - Activity icon (fourth ImageView in bottomNavigationLayout11)
        bottomNav11?.getChildAt(3)?.setOnClickListener {
            // Already on activity page
        }
        
        // Bottom navigation - Profile icon (fifth ImageView in bottomNavigationLayout11)
        bottomNav11?.getChildAt(4)?.setOnClickListener {
            navigateToPage(13)
        }
        
        // Profile icons navigation - navigate to page 21
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
        // Activity screen (You tab) - basic navigation
        // Following tab - navigates to page 11
        findViewById<TextView>(R.id.followingTab12)?.setOnClickListener {
            navigateToPage(11)
        }
        
        // Bottom navigation - Home icon (first ImageView in bottomNavigationLayout12)
        val bottomNav12 = findViewById<LinearLayout>(R.id.bottomNavigationLayout12)
        bottomNav12?.getChildAt(0)?.setOnClickListener {
            navigateToPage(5)
        }
        
        // Bottom navigation - Search icon (second ImageView in bottomNavigationLayout12)
        bottomNav12?.getChildAt(1)?.setOnClickListener {
            navigateToPage(6)
        }
        
        // Bottom navigation - Add icon (third ImageView in bottomNavigationLayout12)
        bottomNav12?.getChildAt(2)?.setOnClickListener {
            navigateToPage(2)
        }
        
        // Bottom navigation - Activity icon (fourth ImageView in bottomNavigationLayout12)
        bottomNav12?.getChildAt(3)?.setOnClickListener {
            navigateToPage(11)
        }
        
        // Bottom navigation - Profile icon (fifth ImageView in bottomNavigationLayout12)
        bottomNav12?.getChildAt(4)?.setOnClickListener {
            navigateToPage(13)
        }
    }
    
    private fun setupPage13() {
        // Profile page navigation
        findViewById<ImageView>(R.id.menu)?.setOnClickListener {
            // Here you would typically show profile menu
            // For now, let's navigate to page 11 (activity)
            navigateToPage(11)
        }
        
        // Profile icon navigation - navigate to page 20
        findViewById<ImageView>(R.id.profileIcon13)?.setOnClickListener {
            navigateToPage(20)
        }
        
        // Profile picture navigation - click to view story/highlight
        findViewById<ImageView>(R.id.profilePicture)?.setOnClickListener {
            navigateToPage(18)
        }
        
        // Edit Profile button navigation
        findViewById<TextView>(R.id.editProfileButton)?.setOnClickListener {
            navigateToPage(15)
        }
        
        // Bottom navigation tabs
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
        
        // Highlight profile icons navigation - navigate to page 14
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
        // Story viewer page navigation
        findViewById<ImageView>(R.id.closeButton)?.setOnClickListener {
            // Close story and go back to profile
            navigateToPage(13)
        }
        
        // Bottom navigation tabs
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
        // Edit Profile page navigation
        findViewById<TextView>(R.id.cancelButton)?.setOnClickListener {
            // Cancel editing and go back to profile
            navigateToPage(13)
        }
        
        findViewById<TextView>(R.id.doneButton)?.setOnClickListener {
            // Save changes and go back to profile
            navigateToPage(13)
        }
        
        findViewById<TextView>(R.id.changePhotoButton)?.setOnClickListener {
            // Here you would typically open photo picker
            // For now, let's navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        findViewById<TextView>(R.id.switchToProfessionalButton)?.setOnClickListener {
            // Here you would typically show professional account options
            // For now, let's navigate to page 11 (activity page)
            navigateToPage(11)
        }
    }
    
    private fun setupPage16() {
        // Media picker page navigation
        findViewById<TextView>(R.id.cancelButton16)?.setOnClickListener {
            // Cancel media selection and go back to profile
            navigateToPage(13)
        }
        
        findViewById<TextView>(R.id.nextButton16)?.setOnClickListener {
            // Proceed with selected media and go back to edit profile
            navigateToPage(15)
        }
        
        // Bottom navigation tabs
        findViewById<LinearLayout>(R.id.libraryTab16)?.setOnClickListener {
            // Already on library tab - stay on page 16
        }
        
        findViewById<LinearLayout>(R.id.photoTab16)?.setOnClickListener {
            // Switch to photo tab - navigate to camera page 17
            navigateToPage(17)
        }
        
        findViewById<LinearLayout>(R.id.videoTab16)?.setOnClickListener {
            // Switch to video tab - here you would filter to videos only
            // For now, let's navigate to page 6 (search page)
            navigateToPage(6)
        }
    }
    
    private fun setupPage17() {
        // Camera interface navigation - only capture button and back button work
        
        // Back button (top right chevron) - navigate back to media picker
        findViewById<ImageView>(R.id.topRightChevron17)?.setOnClickListener {
            navigateToPage(16)
        }
        
        // Capture button - navigate to story editor
        findViewById<ImageView>(R.id.captureButton17)?.setOnClickListener {
            navigateToPage(19)
        }
        
        // All other buttons are disabled (no click listeners)
        // galleryIcon17, flashIcon17, filtersIcon17, switchCameraIcon17 are non-functional
    }
    
    private fun setupPage18() {
        // Story viewer navigation
        findViewById<ImageView>(R.id.closeButton18)?.setOnClickListener {
            // Close story and go back to home
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id.sendMessageIcon18)?.setOnClickListener {
            // Send message - here you would implement message sending
            // For now, let's navigate to page 8 (messages)
            navigateToPage(8)
        }
        
        findViewById<ImageView>(R.id.moreOptionsIcon18)?.setOnClickListener {
            // Show more options - here you would show story options menu
            // For now, let's navigate to page 11 (activity)
            navigateToPage(11)
        }
    }
    
    private fun setupPage19() {
        // Story editor navigation - only back button and down button work
        
        // Back button (close button) - navigate back to camera
        findViewById<ImageView>(R.id.closeButton19)?.setOnClickListener {
            navigateToPage(17)
        }
        
        // Down button (send button) - navigate to page 13
        findViewById<ImageView>(R.id.sendButton19)?.setOnClickListener {
            navigateToPage(13)
        }
        
        // All other buttons are disabled (no click listeners)
        // tagPeopleIcon19, addTextIcon19, stickersIcon19, musicIcon19, moreOptionsIcon19
        // yourStoriesButton19, closeFriendsButton19 are non-functional
    }
    
    private fun setupPage20() {
        // Story viewer navigation
        findViewById<ImageView>(R.id.closeButton20)?.setOnClickListener {
            // Close story viewer and go back to profile
            navigateToPage(13)
        }
        
        findViewById<LinearLayout>(R.id.activityButton20)?.setOnClickListener {
            // Navigate to activity page
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.createButton20)?.setOnClickListener {
            // Navigate to camera for creating content
            navigateToPage(17)
        }
        
        findViewById<LinearLayout>(R.id.facebookButton20)?.setOnClickListener {
            // Navigate to Facebook integration or sharing
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.highlightButton20)?.setOnClickListener {
            // Navigate to highlights or saved stories
            navigateToPage(13)
        }
        
        findViewById<LinearLayout>(R.id.moreButton20)?.setOnClickListener {
            // Show more options - navigate to profile
            navigateToPage(13)
        }
    }
    
    private fun setupPage21() {
        // Profile page navigation
        findViewById<ImageView>(R.id.backButton21)?.setOnClickListener {
            // Go back to previous page
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id.menuButton21)?.setOnClickListener {
            // Show profile menu options
            navigateToPage(15)
        }
        
        findViewById<LinearLayout>(R.id.followingButton21)?.setOnClickListener {
            // Show following options
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.messageButton21)?.setOnClickListener {
            // Navigate to messages
            navigateToPage(8)
        }
        
        findViewById<LinearLayout>(R.id.emailButton21)?.setOnClickListener {
            // Navigate to email or contact
            navigateToPage(15)
        }
        
        findViewById<ImageView>(R.id.addButton21)?.setOnClickListener {
            // Add user or invite
            navigateToPage(8)
        }
        
        findViewById<LinearLayout>(R.id.gridTab21)?.setOnClickListener {
            // Grid view is already selected - no action needed
        }
        
        findViewById<LinearLayout>(R.id.personTagTab21)?.setOnClickListener {
            // Switch to person tag view
            navigateToPage(21)
        }
        
        findViewById<LinearLayout>(R.id.homeButton21)?.setOnClickListener {
            // Navigate to home feed
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.searchButton21)?.setOnClickListener {
            // Navigate to search
            navigateToPage(6)
        }
        
        findViewById<LinearLayout>(R.id.createPostButton21)?.setOnClickListener {
            // Navigate to create post
            navigateToPage(17)
        }
        
        findViewById<LinearLayout>(R.id.activityButton21)?.setOnClickListener {
            // Navigate to activity
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.profileButton21)?.setOnClickListener {
            // Navigate to own profile
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
