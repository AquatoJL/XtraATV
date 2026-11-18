package com.github.twitchjordan.repository

import com.github.twitchjordan.db.SavedFiltersDao
import com.github.twitchjordan.model.ui.SavedFilter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SavedFiltersRepository(
    private val savedFiltersDao: SavedFiltersDao,
) {

    fun getAll() = savedFiltersDao.getAll()

    suspend fun save(item: SavedFilter) = withContext(Dispatchers.IO) {
        savedFiltersDao.insert(item)
    }

    suspend fun delete(item: SavedFilter) = withContext(Dispatchers.IO) {
        savedFiltersDao.delete(item)
    }
}
