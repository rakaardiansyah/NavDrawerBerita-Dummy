package id.co.blogspot.infogabut.applepisi;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new PrestasiFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_prestasi);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
      switch (item.getItemId()) {
          case R.id.nav_prestasi:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new PrestasiFragment()).commit();
              Toast.makeText(this, "Ekstrakulikuler", Toast.LENGTH_SHORT).show();
              break;

          case R.id.nav_programstudi:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new ProgramStudiFragment()).commit();
              Toast.makeText(this, "Program Studi", Toast.LENGTH_SHORT).show();
              break;

          case R.id.nav_fasilitas:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new FasilitasFragment()).commit();
              Toast.makeText(this, "Fasilitas", Toast.LENGTH_SHORT).show();
              break;

          case R.id.nav_ekstrakulikuler:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new EkstrakulikulerFragment()).commit();
              Toast.makeText(this, "Ekstrakulikuler", Toast.LENGTH_SHORT).show();
              break;

          case R.id.nav_pendaftaran:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new PendaftaranFragment()).commit();
              Toast.makeText(this, "Pendaftaran", Toast.LENGTH_SHORT).show();
              break;

          case R.id.nav_loker:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new BeritalokerActivity()).commit();
              Toast.makeText(this, "Info Loker", Toast.LENGTH_SHORT).show();
              break;

          case R.id.nav_buletin:
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new BuletinActivity()).commit();
              Toast.makeText(this, "Buletin", Toast.LENGTH_SHORT).show();
              break;
      }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
