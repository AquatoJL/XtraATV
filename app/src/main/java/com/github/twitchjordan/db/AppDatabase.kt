package com.github.twitchjordan.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.twitchjordan.model.NotificationUser
import com.github.twitchjordan.model.PlaybackState
import com.github.twitchjordan.model.ShownNotification
import com.github.twitchjordan.model.VideoPosition
import com.github.twitchjordan.model.chat.RecentEmote
import com.github.twitchjordan.model.ui.Bookmark
import com.github.twitchjordan.model.ui.BookmarkIgnoredUser
import com.github.twitchjordan.model.ui.ChannelSort
import com.github.twitchjordan.model.ui.CustomProxy
import com.github.twitchjordan.model.ui.GameSort
import com.github.twitchjordan.model.ui.LocalChannelFollow
import com.github.twitchjordan.model.ui.LocalGameFollow
import com.github.twitchjordan.model.ui.OfflineVideo
import com.github.twitchjordan.model.ui.RecentSearch
import com.github.twitchjordan.model.ui.SavedFilter
import com.github.twitchjordan.model.ui.StreamProxy
import com.github.twitchjordan.model.ui.TranslatedChannel
import com.github.twitchjordan.model.ui.VideoSwap

@Database(
    entities = [
        OfflineVideo::class,
        RecentEmote::class,
        VideoPosition::class,
        LocalChannelFollow::class,
        LocalGameFollow::class,
        Bookmark::class,
        BookmarkIgnoredUser::class,
        ChannelSort::class,
        GameSort::class,
        ShownNotification::class,
        NotificationUser::class,
        TranslatedChannel::class,
        SavedFilter::class,
        RecentSearch::class,
        PlaybackState::class,
        CustomProxy::class,
        StreamProxy::class,
        VideoSwap::class,
    ],
    version = 41,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun offlineVideos(): OfflineVideosDao
    abstract fun recentEmotes(): RecentEmotesDao
    abstract fun videoPositions(): VideoPositionsDao
    abstract fun localChannelFollows(): LocalChannelFollowsDao
    abstract fun localGameFollows(): LocalGameFollowsDao
    abstract fun bookmarks(): BookmarksDao
    abstract fun bookmarkIgnoredUsers(): BookmarkIgnoredUsersDao
    abstract fun channelSort(): ChannelSortDao
    abstract fun gameSort(): GameSortDao
    abstract fun shownNotifications(): ShownNotificationsDao
    abstract fun notificationUsers(): NotificationUsersDao
    abstract fun translatedChannels(): TranslatedChannelsDao
    abstract fun savedFilters(): SavedFiltersDao
    abstract fun recentSearches(): RecentSearchesDao
    abstract fun playbackStates(): PlaybackStatesDao
    abstract fun customProxies(): CustomProxiesDao
    abstract fun streamProxies(): StreamProxiesDao
    abstract fun videoSwap(): VideoSwapDao
}