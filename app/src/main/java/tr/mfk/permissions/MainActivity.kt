package tr.mfk.permissions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tr.mfk.permissionchecker.PermissionsCheck

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val permissionsToCheck = arrayOf(
            android.Manifest.permission.CAMERA,
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        )
        PermissionsCheck(this).checkAndRequestPermissions(permissionsToCheck,1)

    }
}