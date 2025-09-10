package com.example.socially

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.ImageView
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
        // Page 1 is the splash screen - no navigation needed
        // You can add a timer here to auto-navigate after a few seconds
    }
    
    private fun setupPage2() {
        // Back arrow navigation
        findViewById<ImageView>(R.id.backArrowImageView)?.setOnClickListener {
            navigateToPage(1)
        }
        
        // Create Account button navigation
        findViewById<Button>(R.id.createAccountButton)?.setOnClickListener {
            // Here you would typically validate the form and then navigate
            // For now, let's navigate to page 4 (login with input fields)
            navigateToPage(4)
        }
    }
    
    private fun setupPage3() {
        // Login button navigation
        findViewById<Button>(R.id.loginButton)?.setOnClickListener {
            // Here you would typically validate login and navigate to main app
            // For now, let's navigate to page 1 (splash screen)
            navigateToPage(1)
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
            // Here you would typically validate login credentials
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
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
        // Camera icon navigation
        findViewById<ImageView>(R.id.cameraIconImageView)?.setOnClickListener {
            // Here you would typically open camera
            // For now, let's navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        // Notification bell navigation
        findViewById<ImageView>(R.id.notificationBellImageView)?.setOnClickListener {
            // Here you would typically show notifications
            // For now, let's navigate to page 3 (profile login)
            navigateToPage(3)
        }
        
        // Message icon navigation
        findViewById<ImageView>(R.id.messageIconImageView)?.setOnClickListener {
            // Here you would typically open messages
            // For now, let's navigate to page 4 (login with inputs)
            navigateToPage(4)
        }
        
        // Bottom navigation tabs
        findViewById<LinearLayout>(R.id.homeTabLayout)?.setOnClickListener {
            // Already on home page
        }
        
        findViewById<LinearLayout>(R.id.searchTabLayout)?.setOnClickListener {
            // Navigate to page 6 (search/explore page)
            navigateToPage(6)
        }
        
        findViewById<LinearLayout>(R.id.addTabLayout)?.setOnClickListener {
            // Here you would typically open create post
            // For now, let's navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout)?.setOnClickListener {
            // Here you would typically open activity
            // For now, let's navigate to page 3 (profile login)
            navigateToPage(3)
        }
        
        findViewById<LinearLayout>(R.id.profileTabLayout)?.setOnClickListener {
            // Here you would typically open profile
            // For now, let's navigate to page 3 (profile login)
            navigateToPage(3)
        }
    }
    
    private fun setupPage6() {
        // Scan icon navigation
        findViewById<ImageView>(R.id.scanIconImageView)?.setOnClickListener {
            // Here you would typically open camera scanner
            // For now, let's navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        // Category buttons navigation
        findViewById<TextView>(R.id.shopButton)?.setOnClickListener {
            // Here you would typically filter by shop category
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<TextView>(R.id.styleButton)?.setOnClickListener {
            // Here you would typically filter by style category
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<TextView>(R.id.sportsButton)?.setOnClickListener {
            // Here you would typically filter by sports category
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<TextView>(R.id.autoButton)?.setOnClickListener {
            // Here you would typically filter by auto category
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<TextView>(R.id.musicButton)?.setOnClickListener {
            // Here you would typically filter by music category
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        // Bottom navigation tabs
        findViewById<LinearLayout>(R.id.homeTabLayout)?.setOnClickListener {
            // Navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.searchTabLayout)?.setOnClickListener {
            // Already on search page
        }
        
        findViewById<LinearLayout>(R.id.addTabLayout)?.setOnClickListener {
            // Here you would typically open create post
            // For now, let's navigate to page 2 (signup page)
            navigateToPage(2)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout)?.setOnClickListener {
            // Here you would typically open activity
            // For now, let's navigate to page 3 (profile login)
            navigateToPage(3)
        }
        
        findViewById<LinearLayout>(R.id.profileTabLayout)?.setOnClickListener {
            // Navigate to page 13 (profile page)
            navigateToPage(13)
        }
    }
    
    private fun setupPage7() {
        // Search results page - basic navigation
        findViewById<ImageView>(R.id.backArrow7)?.setOnClickListener {
            navigateToPage(6)
        }
    }
    
    private fun setupPage8() {
        // Messages list page - basic navigation
        findViewById<ImageView>(R.id.backArrow8)?.setOnClickListener {
            navigateToPage(5)
        }
    }
    
    private fun setupPage9() {
        // Chat detail page - basic navigation
        findViewById<ImageView>(R.id.backArrow9)?.setOnClickListener {
            navigateToPage(8)
        }
    }
    
    private fun setupPage10() {
        // Call screen page - basic navigation
        findViewById<ImageView>(R.id.endCallButton)?.setOnClickListener {
            navigateToPage(8)
        }
    }
    
    private fun setupPage11() {
        // Activity screen - basic navigation
        findViewById<LinearLayout>(R.id.homeTabLayout11)?.setOnClickListener {
            navigateToPage(5)
        }
        findViewById<LinearLayout>(R.id.searchTabLayout11)?.setOnClickListener {
            navigateToPage(6)
        }
        findViewById<LinearLayout>(R.id.addTabLayout11)?.setOnClickListener {
            navigateToPage(2)
        }
        findViewById<LinearLayout>(R.id.activityTabLayout11)?.setOnClickListener {
            // Already on activity page
        }
        findViewById<LinearLayout>(R.id.profileTabLayout11)?.setOnClickListener {
            navigateToPage(13)
        }
    }
    
    private fun setupPage12() {
        // Activity screen (You tab) - basic navigation
        findViewById<LinearLayout>(R.id.homeTabLayout12)?.setOnClickListener {
            navigateToPage(5)
        }
        findViewById<LinearLayout>(R.id.searchTabLayout12)?.setOnClickListener {
            navigateToPage(6)
        }
        findViewById<LinearLayout>(R.id.addTabLayout12)?.setOnClickListener {
            navigateToPage(2)
        }
        findViewById<LinearLayout>(R.id.activityTabLayout12)?.setOnClickListener {
            // Already on activity page
        }
        findViewById<LinearLayout>(R.id.profileTabLayout12)?.setOnClickListener {
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
        
        // Bottom navigation tabs
        findViewById<LinearLayout>(R.id.homeTabLayout13)?.setOnClickListener {
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.searchTabLayout13)?.setOnClickListener {
            navigateToPage(6)
        }
        
        findViewById<LinearLayout>(R.id.addTabLayout13)?.setOnClickListener {
            navigateToPage(2)
        }
        
        findViewById<LinearLayout>(R.id.activityTabLayout13)?.setOnClickListener {
            navigateToPage(11)
        }
        
        findViewById<LinearLayout>(R.id.profileTabLayout13)?.setOnClickListener {
            // Already on profile page
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
        
        findViewById<LinearLayout>(R.id/createTabLayout14)?.setOnClickListener {
            navigateToPage(2)
        }
        
        findViewById<LinearLayout>(R.id/createPostTabLayout14)?.setOnClickListener {
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
            // Cancel media selection and go back to edit profile
            navigateToPage(15)
        }
        
        findViewById<TextView>(R.id.nextButton16)?.setOnClickListener {
            // Proceed with selected media and go back to edit profile
            navigateToPage(15)
        }
        
        // Bottom navigation tabs
        findViewById<LinearLayout>(R.id.libraryTab16)?.setOnClickListener {
            // Already on library tab
        }
        
        findViewById<LinearLayout>(R.id.photoTab16)?.setOnClickListener {
            // Switch to photo tab - here you would filter to photos only
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.videoTab16)?.setOnClickListener {
            // Switch to video tab - here you would filter to videos only
            // For now, let's navigate to page 6 (search page)
            navigateToPage(6)
        }
    }
    
    private fun setupPage17() {
        // Camera interface navigation
        findViewById<ImageView>(R.id.topRightChevron17)?.setOnClickListener {
            // Close camera and go back to media picker
            navigateToPage(16)
        }
        
        findViewById<ImageView>(R.id.galleryIcon17)?.setOnClickListener {
            // Open gallery/media picker
            navigateToPage(16)
        }
        
        findViewById<ImageView>(R.id.flashIcon17)?.setOnClickListener {
            // Toggle flash - here you would implement flash functionality
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id.filtersIcon17)?.setOnClickListener {
            // Open filters - here you would show filter options
            // For now, let's navigate to page 6 (search page)
            navigateToPage(6)
        }
        
        findViewById<ImageView>(R.id.switchCameraIcon17)?.setOnClickListener {
            // Switch between front/rear camera - here you would implement camera switching
            // For now, let's navigate to page 13 (profile page)
            navigateToPage(13)
        }
        
        findViewById<ImageView>(R.id.captureButton17)?.setOnClickListener {
            // Capture photo/video - here you would implement capture functionality
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
    }
    
    private fun setupPage18() {
        // Story viewer navigation
        findViewById<ImageView>(R.id.closeButton18)?.setOnClickListener {
            // Close story and go back to main feed
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
        // Story editor navigation
        findViewById<ImageView>(R.id.closeButton19)?.setOnClickListener {
            // Close story editor and go back to camera
            navigateToPage(17)
        }
        
        findViewById<ImageView>(R.id/tagPeopleIcon19)?.setOnClickListener {
            // Tag people - here you would show people tagging interface
            // For now, let's navigate to page 8 (messages)
            navigateToPage(8)
        }
        
        findViewById<ImageView>(R.id/addTextIcon19)?.setOnClickListener {
            // Add text - here you would show text editor
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<ImageView>(R.id/stickersIcon19)?.setOnClickListener {
            // Add stickers - here you would show sticker picker
            // For now, let's navigate to page 6 (search)
            navigateToPage(6)
        }
        
        findViewById<ImageView>(R.id/musicIcon19)?.setOnClickListener {
            // Add music - here you would show music picker
            // For now, let's navigate to page 13 (profile)
            navigateToPage(13)
        }
        
        findViewById<ImageView>(R.id/effectsIcon19)?.setOnClickListener {
            // Add effects - here you would show effects picker
            // For now, let's navigate to page 11 (activity)
            navigateToPage(11)
        }
        
        findViewById<ImageView>(R.id/moreOptionsIcon19)?.setOnClickListener {
            // More options - here you would show additional options
            // For now, let's navigate to page 15 (edit profile)
            navigateToPage(15)
        }
        
        findViewById<LinearLayout>(R.id.yourStoriesButton19)?.setOnClickListener {
            // Share to your stories - here you would implement story sharing
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
        
        findViewById<LinearLayout>(R.id.closeFriendsButton19)?.setOnClickListener {
            // Share to close friends - here you would implement close friends sharing
            // For now, let's navigate to page 8 (messages)
            navigateToPage(8)
        }
        
        findViewById<ImageView>(R.id/sendButton19)?.setOnClickListener {
            // Send story - here you would implement story sending
            // For now, let's navigate to page 5 (main feed)
            navigateToPage(5)
        }
    }
    
    private fun setupPage20() {
        // Story viewer navigation
        findViewById<ImageView>(R.id.closeButton20)?.setOnClickListener {
            // Close story viewer and go back to main feed
            navigateToPage(5)
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
