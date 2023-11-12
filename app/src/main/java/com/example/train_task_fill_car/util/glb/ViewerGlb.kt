package com.example.train_task_fill_car.util.glb

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.example.train_task_fill_car.network.Const

class ViewerGlb(private val context: Context) {
    fun startActivityWithGlb(urlGlb: String = Const.DEFAULT_GLB) {
        val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
        sceneViewerIntent.data =
            Uri.parse("${Const.GOOGLE_VIEWER_WITH_FILE}${urlGlb}")
        sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox")
        context.startActivity(sceneViewerIntent)
    }
}