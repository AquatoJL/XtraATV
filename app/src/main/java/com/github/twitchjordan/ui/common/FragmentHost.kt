package com.github.twitchjordan.ui.common

import androidx.fragment.app.Fragment

interface FragmentHost {
    val currentFragment: Fragment?
}