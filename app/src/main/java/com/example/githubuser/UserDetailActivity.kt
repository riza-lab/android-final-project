package com.example.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class UserDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        showUserDetail()
    }

    private fun showUserDetail() {
        val user = intent.getParcelableExtra<User>(UserDetailActivity.EXTRA_USER)

        val ivAvatar: ImageView = findViewById(R.id.iv_detail_avatar)
        var tvUsername: TextView = findViewById(R.id.tv_detail_username)
        var tvName: TextView = findViewById(R.id.tv_detail_name)
        var tvCompany: TextView = findViewById(R.id.tv_detail_company)
        var tvRepository: TextView = findViewById(R.id.tv_detail_repository)
        var tvFollower: TextView = findViewById(R.id.tv_detail_follower)
        var tvFollowing: TextView = findViewById(R.id.tv_detail_following)

        ivAvatar.setImageResource(user?.avatar!!)
        tvUsername.text = user.username
        tvName.text = user.name
        tvCompany.text = user.company
        tvRepository.text = user.repository.toString()
        tvFollower.text = user.follower.toString()
        tvFollowing.text = user.following.toString()
    }
}