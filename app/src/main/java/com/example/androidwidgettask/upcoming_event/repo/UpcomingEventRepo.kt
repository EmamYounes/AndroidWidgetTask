import com.example.androidwidgettask.upcoming_event.data.UpcomingEventDao
import com.example.androidwidgettask.upcoming_event.data.UpcomingEventData

class UpcomingEventRepo private constructor(private val upcomingEventDao: UpcomingEventDao) {
    fun setUpcomingData(data: UpcomingEventData) {
        upcomingEventDao.setUpcomingData(data)
    }

    fun getUpcomingData() = upcomingEventDao.getUpcomingData()

    companion object {
        @Volatile
        private var instance: UpcomingEventRepo? = null

        fun getInstance(upcomingEventDao: UpcomingEventDao) =
            instance ?: synchronized(lock = this) {
                instance ?: UpcomingEventRepo(upcomingEventDao).also {
                    instance = it
                }
            }
    }
}