package com.camilobc.ipialestravel;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class hotel1Fragment extends Fragment {

//public class hotel1Fragment extends Fragment implements OnMapReadyCallback {

//    private MapView mapView;
//    private GoogleMap mMap;

    public hotel1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hotel1,container,false);
//        mapView =(MapView) view.findViewById(R.id.map);
//        mapView.onCreate(savedInstanceState);
//        mapView.getMapAsync(this);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel1, container, false); //antes si estaba esta linea, la cambio por los mapas
//        return view;

    }

//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//
//        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) { //cambio this por getcontext, esto lo copio desde mapsactivity
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
//        mMap.setMyLocationEnabled(true);
//        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//
//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//
//        LatLng udea= new LatLng(6.266953, -75.569111);
//        mMap.addMarker(new MarkerOptions().position(udea).title("Universidad de Antioquia").snippet("Nuestra alma mater").icon(BitmapDescriptorFactory.fromResource(R.drawable.libro)));
////        mMap.moveCamera(CameraUpdateFactory.newLatLng(udea));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(udea,15)); //entre mas pequeño el numero mas alto el mapa
//    }
////los siguintes tambien son necesarios para que el mapa no tarde en cargarse
//    @Override
//    public void onResume() {
//        mapView.onResume();
//        super.onResume();
//    }
//
//    @Override
//    public void onDestroy() {
//        mapView.onDestroy();
//        super.onDestroy();
//    }
//
//    @Override
//    public void onLowMemory() {
//        mapView.onLowMemory();
//        super.onLowMemory();
//    }
}
