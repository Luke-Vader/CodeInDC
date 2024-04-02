import http from '../http-common'

class ActivityService {
  findByType(type) {
    return http.get(`/activity?type=${type}`)
  }
}

export default new ActivityService()
